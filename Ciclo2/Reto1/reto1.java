import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float vector[] = new float [Integer.parseInt(input.nextLine())];
        float prom = 0f;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Float.parseFloat(input.nextLine());
        }
        for (int i = 0; i < vector.length; i++) {
            prom += vector[i];
        }
        System.out.println(risklvl(prom/vector.length));
        System.out.println(risklvl(maxymin("max", vector)));
        System.out.println(risklvl(maxymin("min", vector)));
    }
    public static String risklvl(float risk){
        if (risk > 80 & risk <= 100) {
            return "INVIABLE SANITARIAMENTE";
        } else if(risk > 35 & risk <= 80){
            return "ALTO";
        } else if(risk > 14 & risk <= 35){
            return "MEDIO";
        } else if(risk > 5 & risk <= 14){
            return "BAJO";
        } else if(risk >= 0 & risk <= 5){
            return "SIN RIESGO";
        } else{
            return null;
        }
    }
    public static float maxymin(String m , float v[]){
        if (m.equals("max")){
            float maximun = v[0];
            for (float i : v) {
                if (i > maximun){
                    maximun = i;
                }
            }
            return maximun;
        } else{
            float min = v[0];
            for (float i : v) {
                if (i < min){
                    min = i;
                }
            }
            return min;
        }
    }
}