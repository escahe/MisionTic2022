/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto4;

/**
 *
 * @author Esteban
 */
public class CuerpoDeAgua extends ObjetoGeografico {

    private String risk_lvl;

    public CuerpoDeAgua() {
        super();
    }

    @Override
    protected String nivel(){
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
            return "INVÁLIDO";
        }
    }

    public void setRisk_index(float risk_index) {
        this.risk_index = risk_index;
        this.risk_lvl = nivel();
    }
    
    public String getRisk_lvl() {
        return risk_lvl;
    }
}
