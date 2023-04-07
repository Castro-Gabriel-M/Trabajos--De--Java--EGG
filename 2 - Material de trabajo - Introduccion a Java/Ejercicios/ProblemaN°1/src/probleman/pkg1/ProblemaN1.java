package probleman.pkg1;
import java.util.Scanner;

public class ProblemaN1 {
   
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros");
        int num1 = leer.nextByte();
        int num2 = leer.nextByte();
        
        int suma = num1 + num2;
        System.out.println("La suma de los numero " + num1 + " y " + num2 + " da como resultado: " + suma);
    }
}
