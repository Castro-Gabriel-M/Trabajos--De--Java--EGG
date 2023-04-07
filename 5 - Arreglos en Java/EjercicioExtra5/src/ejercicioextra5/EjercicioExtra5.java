package ejercicioextra5;

import java.util.Scanner;

public class EjercicioExtra5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese la dimension de la Matriz");
        int N = leer.nextInt();
        int M = leer.nextInt();
        int[][] matriz = new int[N][M];
        int suma = 0;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = (int) (Math.random() * 10+1);
                suma += matriz[i][j];
            }
        }
        
        System.out.println("La suma de los datos de la matriz es: "+suma);
    }
}
