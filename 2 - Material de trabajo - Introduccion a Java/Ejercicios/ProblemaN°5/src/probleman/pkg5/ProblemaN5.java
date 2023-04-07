package probleman.pkg5;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class ProblemaN5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num1;
        num1 = leer.nextByte();
        
        int elDoble;
        elDoble = num1 * 2;
        int elTriple;
        elTriple = num1 * 3;
        double laRaiz;
        laRaiz = sqrt(num1);
        
        System.out.println("El doble del numero es: " + elDoble);
        System.out.println("El triple del numero es: " + elTriple);
        System.out.println("La raiz cuadrada del numero es: " + laRaiz);
    }
}
