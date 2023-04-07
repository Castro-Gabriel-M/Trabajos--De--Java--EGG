package probleman.pkg4;

import java.util.Scanner;

public class ProblemaN4 {

    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingrese una Temperatura en Grados Centigrados");
    double C;
    C = leer.nextByte();
    
    double Fahrenheit = 32 + (9 * (C / 5));
    
    System.out.println("Calculado a Fahrenheit seria: " + Fahrenheit);
    }
}
