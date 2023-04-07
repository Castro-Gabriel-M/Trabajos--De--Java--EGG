package ejercicioextra2;
import java.util.Scanner;

public class EjercicioExtra2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int A,B,C,D;
        int aux;
        
        A = leer.nextInt();
        B = leer.nextInt();
        C = leer.nextInt();
        D = leer.nextInt();
        
        System.out.println("A: " +A+" B: " +B+" C: " +C+" D: " +D);
        
        aux = B;
        
        B = C;
        C = A;
        A = D;
        D = aux;
        
        System.out.println("A: " +A+" B: " +B+" C: " +C+" D: " +D);
    }
}
