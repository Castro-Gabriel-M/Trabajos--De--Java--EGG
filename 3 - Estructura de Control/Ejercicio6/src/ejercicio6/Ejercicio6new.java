package ejercicio6;
import java.util.Scanner;

public class Ejercicio6new {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros y elija la opcion que desee hacer");
        int num1 = leer.nextByte();
        int num2 = leer.nextByte();
        String op1 = null;
        
        System.out.println("MENU");
        System.out.println("1 - SUMAR");
        System.out.println("2 - RESTAR");
        System.out.println("3 - MULTIPLICAR");
        System.out.println("4 - DIVIDIR");
        System.out.println("5 - SALIR");
                
        do {
            
            int opcion = leer.nextByte();
            
            switch(opcion) {
            case 1:
                int suma = num1 + num2;
                System.out.println("La suma es: " + suma);
                break;
                
            case 2:
                int resta = num1 - num2;
                System.out.println("La resta es: " + resta);
                break;
                
            case 3:
                int mult = num1 * num2;
                System.out.println("La multiplicacion es: " + mult);
                break;
                
            case 4:
                int div = num1 / num2;
                System.out.println("La division es: " + div);
                break;
                
            case 5:
                System.out.println("¿Está seguro que desea salir del programa? (S/N)");
                op1 = leer.next();
                break;
                
            default:
                System.out.println("La opcion que elegio no corresponde, vuelva a intentar");
        } 
        } while("S".equals(op1));
    } 
}
