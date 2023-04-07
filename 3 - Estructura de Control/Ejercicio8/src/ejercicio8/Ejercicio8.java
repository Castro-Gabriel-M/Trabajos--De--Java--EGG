package ejercicio8;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una dimension");
        int num = leer.nextByte();
        int i;
        int j;
        

        for (i = 1; i <= num; i++){
            for (j = 1; j <= num; j++){
                
                if (i > 1 && i < num && j > 1 && j < num){
                   System.out.print(" ");
                }  else System.out.print("*");
            }
            System.out.println();
        }
    }
}
