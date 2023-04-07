package ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos numero");
        int num1, num2;
        num1 = leer.nextByte();
        num2 = leer.nextByte();
        
        System.out.println("MENU");
        System.out.println("1: SUMA");
        System.out.println("2: RESTA");
        System.out.println("3: MULTIPLICACION");
        System.out.println("4: DIVISION");
        System.out.println("5: SALIR");
        int opcion = leer.nextByte();
        
        
            switch(opcion){
            case 1:
                System.out.println("SUMA: " +suma(num1, num2));
                break;
            case 2:
                System.out.println("SUMA: " + resta(num1, num2));
                break;
            case 3:
                System.out.println("SUMA: " + multiplicacion(num1, num2));
                break;
            case 4:
                System.out.println("SUMA: " + division(num1, num2));
                break;
            case 5:
                System.out.println("Saliendo del Programa");
                break;
        }
        
    }
//-------------------------------------------------------------------
        public static int suma(int num1, int num2){
            int sumar;
            sumar = num1 + num2;
            return sumar;
        }
//-------------------------------------------------------------------        
        public static int resta(int num1, int num2){
            int restar;
            restar = num1 - num2;
            return restar;
        }
//-------------------------------------------------------------------        
        public static int multiplicacion(int num1, int num2){
            int mult;
            mult = num1 * num2;
            return mult;
        }
//-------------------------------------------------------------------        
        public static int division(int num1, int num2){
            int div;
            div = num1 / num2;
            return div;
        }
//-------------------------------------------------------------------
}
