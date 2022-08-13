import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CuerpoDeAgua vector[] = new CuerpoDeAgua[Integer.parseInt(input.nextLine())];
        int counter = 0;     
        
        for (int i = 0; i < vector.length; i++) {
            String row[] = new String [4];
            row = input.nextLine().split(" ");
            vector[i] = new CuerpoDeAgua();
            vector[i].setName(row[0]);
            vector[i].setId(Integer.parseInt(row[1]));
            vector[i].setCity(row[2]);
            vector[i].setRisk_index(Float.parseFloat(row[3]));
        }
        for (CuerpoDeAgua cda : vector) {
            System.out.println(cda.getRisk_lvl());
            if(cda.getRisk_index()>= 0 & cda.getRisk_index()<= 35){
                counter ++;
            }
        }
        System.out.println(counter);
        counter = 0;
        String print = "";
        for (CuerpoDeAgua cda : vector) {
            if(cda.getRisk_lvl().equals("MEDIO")){
                print += cda.getName() + " ";
                counter ++;
            }
        }
        if(counter == 0){
            System.out.println("NA");
        }else{
            System.out.println(print);
        }
        counter = 0;
        for (int i = 0; i < vector.length; i++) {
            if(vector[i].getRisk_index() < vector[counter].getRisk_index()){
                counter = i;
            }
        }
        System.out.println(vector[counter].getName() + " " + vector[counter].getId());
    }
}