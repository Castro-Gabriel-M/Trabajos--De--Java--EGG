package ejercicio6;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        boolean retorno = false;

        int[][] matriz = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};

        //int[][] matriz = new int[3][3];
        //for (int i = 0; i < 3; i++) {
        //for (int j = 0; j < 3; j++) {
        // matriz[i][j] = leer.nextInt();
        //}
        //}
        CuadradoMagico(matriz);
    }

    public static void CuadradoMagico(int[][] matriz) {
        int contFilas = 0;
        int contColum = 0;
        int contDiag1 = 0;
        int contDiag2 = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                contFilas = contFilas + matriz[i][j];
                contColum = contColum + matriz[j][i];
                
                if(i == j){
                    contDiag1 = contDiag1 + matriz[i][j];
                    contDiag2 = contDiag2 + matriz[j][i];
                }
            }
        }
        System.out.println("Columnas: "+contColum);
        System.out.println("Filas: "+contFilas);
        System.out.println("Diagonal: "+contDiag1);
        System.out.println("Diagonal: "+contDiag2);
    }
}
