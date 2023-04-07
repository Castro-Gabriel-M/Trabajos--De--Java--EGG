package ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad de Euros");
        int EUR = leer.nextByte();
        
        conversion(EUR);
    }
//--------------------------------------------------------------    
    public static void conversion(int EUR){
        double USD, JPY, GBP;
        USD = 1.28611;
        JPY = 129.852;
        GBP = 0.86;
        
        USD = EUR * USD;
        JPY = EUR * JPY;
        GBP = EUR * GBP;
        
        System.out.println("OBTENDRIAS CON EUR");
        System.out.println("UDS: " +USD);
        System.out.println("JPY: " +JPY);
        System.out.println("GBP: " +GBP);
    }
//--------------------------------------------------------------     
}
