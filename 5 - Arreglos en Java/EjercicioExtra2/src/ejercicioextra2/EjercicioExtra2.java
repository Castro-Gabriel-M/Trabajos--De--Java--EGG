package ejercicioextra2;

import java.util.Scanner;

public class EjercicioExtra2 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese los tamaños de los Vectores A y B");
        int tam = leer.nextInt();
        int[] vectorA = new int[tam];
        int[] vectorB = new int[tam];
        
        for (int i = 0; i < tam; i++) {
            vectorA[i] = (int)(Math.random()*10);
            System.out.println(+vectorA[i]);
            vectorB[i] = (int)(Math.random()*10);
            System.out.println(vectorB[i]);
            
            if(vectorA[i] != vectorB[i]){
                System.out.println("Se econtraron valores diferentes y se detuvo el programa");
                break;
            }
        }
    }
}
