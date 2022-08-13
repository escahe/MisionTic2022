package DB;
/**
 *
 * @author Esteban
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteConnection {
    
    private Connection connection = null;
    private ResultSet resultSet = null;
    private Statement statement = null;
    private String dbPath;
    
//Constructor de clase que se conecta a la base de datos SQLite 
    public SQLiteConnection(String dbPath){
        this.dbPath = dbPath;
      try{
         Class.forName("org.sqlite.JDBC");
         connection = DriverManager.getConnection("jdbc:sqlite:" + this.dbPath );
         System.out.println("Conectado a la base de datos SQLite [ " + this.dbPath + "]");
      }catch(Exception e){
         System.out.println(e);
      }
    }

 /* METODO PARA INSERTAR UN REGISTRO EN LA BASE DE DATOS
 * INPUT:
 table = Nombre de la tabla
 fields = String con los nombres de los campos donde insertar Ej.: campo1,campo2campo_n
 values = String con los datos de los campos a insertar Ej.: valor1, valor2, valor_n
 * OUTPUT:
 * Boolean
*/
    public boolean insert(String table, String fields, String values){
        
        boolean isDone=false;
        //Se arma la consulta
        String query =" INSERT INTO " + table + " ( " + fields + " ) VALUES ( " + values + " ) ";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = connection.prepareStatement(query);
            pstm.execute();
            pstm.close();
            isDone=true;
        }catch(Exception e){
            System.out.println(e);
        }
        return isDone;
    }

 /* METODO PARA REALIZAR UNA CONSULTA A LA BASE DE DATOS
 * INPUT:
 * OUTPUT: String con los datos concatenados
*/
    public String select(String table, String fields, String condition){
        String header[] = fields.split(",");
        String result = "";
        try {
            statement = connection.createStatement();
            if(condition == null){
                resultSet = statement.executeQuery("SELECT "+ fields + " FROM " + table +";");
            }else{
                resultSet = statement.executeQuery("SELECT "+ fields + " FROM " + table +" WHERE " + condition +";");
            }
            while (resultSet.next()){
                for (int i = 0; i < header.length; i++) {
                    if(i < header.length - 1){
                        result +=  resultSet.getString(header[i])+",";
                    }else{result +=  resultSet.getString(header[i])+"\n";}
                }
            }
        }catch (SQLException ex) {
            System.out.println(ex);
        }
        return result;
    }

    public boolean delete(String table, String condition){
        
        boolean isDone=false;
        //Se arma la consulta
        String query = "DELETE FROM " + table + " WHERE " + condition +";";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = connection.prepareStatement(query);
            pstm.execute();
            pstm.close();
            isDone=true;
        }catch(Exception e){
            System.out.println(e);
        }
        return isDone;
    }
    
    public boolean update(String table, String fieldsAndNewValues, String condition){
        boolean isDone=false;
        //Se arma la consulta
        String query = " UPDATE " + table + " SET " + fieldsAndNewValues +" WHERE " + condition +"; ";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = connection.prepareStatement(query);
            pstm.execute();
            pstm.close();
            isDone=true;
        }catch(Exception e){
            System.out.println(e);
        }
        return isDone;
    }
    
    public void desconectar(){
        try {
            resultSet.close();
            statement.close();
            connection.close();
            System.out.println("Desconectado de la base de datos [ " + this.dbPath + "]");
        }catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
