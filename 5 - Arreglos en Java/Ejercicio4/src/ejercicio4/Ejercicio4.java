package ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];
        
        LlenarMatrizA(matrizA);
        TranspuestaMatrizB(matrizA, matrizB);
    }
//------------------------------------------------------------------------------   
    public static void LlenarMatrizA(int[][] matrizA){
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j] = (int)(Math.random()*10);
                System.out.print("["+matrizA[i][j]+"]");
            }
            System.out.println();
        }
        System.out.println();
    }
//------------------------------------------------------------------------------
    public static void TranspuestaMatrizB(int[][] matrizA, int[][] matrizB){
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB[i][j] = matrizA[j][i];
                System.out.print("["+matrizB[i][j]+"]");
            }
            System.out.println();
        }
    }
//------------------------------------------------------------------------------    
}
