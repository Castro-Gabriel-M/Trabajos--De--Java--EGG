package ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el tamaño del vector");
        int tam = leer.nextInt();
        int[] vector = new int[tam];
        
        LlenarVector(vector, tam);
        ImprimirVector(vector, tam);
    }
    
    public static void LlenarVector(int[] vector, int tam){
        
        for (int i = 0; i < tam; i++) {
            vector[i] = (int)(Math.random()*10);
        }
    }
    
    public static void ImprimirVector(int[] vector, int tam){
        
        for (int i = 0; i < tam; i++) {
            System.out.print("["+vector[i]+"]");
        }
        System.out.println();
    }
}
