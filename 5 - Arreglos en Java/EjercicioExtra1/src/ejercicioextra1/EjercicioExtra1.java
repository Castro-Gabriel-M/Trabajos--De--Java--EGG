package ejercicioextra1;
import java.util.Scanner;

public class EjercicioExtra1 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese un tamaño para el Vector");
        int tam = leer.nextInt();
        int[] vector = new int[tam];
        
        System.out.println("Ingrese los valores al Vector");
        int suma = 0;
        for (int i = 0; i < tam; i++) {
            vector[i] = leer.nextInt();
            suma = suma + vector[i];
        }
        
        System.out.println("La suma de los valores del Vector es: "+suma);
    }
}
