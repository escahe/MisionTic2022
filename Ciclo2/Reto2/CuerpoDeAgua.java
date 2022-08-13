public class CuerpoDeAgua {
    private String name, city, risk_lvl;
    private int id;
    private float risk_index;
    
    public CuerpoDeAgua() {
    }

    private String nivel(){
        if (risk_index > 80 & risk_index <= 100) {
            return "INVIABLE SANITARIAMENTE";
        } else if(risk_index > 35 & risk_index <= 80){
            return "ALTO";
        } else if(risk_index > 14 & risk_index <= 35){
            return "MEDIO";
        } else if(risk_index > 5 & risk_index <= 14){
            return "BAJO";
        } else if(risk_index >= 0 & risk_index <= 5){
            return "SIN RIESGO";
        } else{
            return null;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getRisk_index() {
        return risk_index;
    }

    public void setRisk_index(float risk_index) {
        this.risk_index = risk_index;
        this.risk_lvl = nivel();
    }
    
    public String getRisk_lvl() {
        return risk_lvl;
    }

}
