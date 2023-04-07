package ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int vector[] = new int [100];
        int num = 100;
        int i;
        
        for(i = 0; i < 100; i++){
            vector[i] = num - i;
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
    }
}
