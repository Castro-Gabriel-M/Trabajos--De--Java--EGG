package ejercicio5;

public class Ejercicio5 {

    public static void main(String[] args) {

        int[][] matrizA = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] matrizB = new int[3][3];

        Matrices(matrizA, matrizB);
        Antisimetrica(matrizA, matrizB);
    }
//------------------------------------------------------------------------------    

    public static void Matrices(int[][] matrizA, int[][] matrizB) {

        System.out.println("MATRIZ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizA[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("MATRIZ TRANSPUESTA");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizB[i][j] = matrizA[j][i];
                System.out.print("[" + matrizB[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println();
    }
//------------------------------------------------------------------------------

    public static void Antisimetrica(int[][] matrizA, int[][] matrizB) {
        int cont = 0;

        System.out.println("MATRIZ ANTISIMETRICA");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (matrizA[i][j] == (-matrizB[i][j])) {
                    cont = cont + 1;
                }
            }
        }
        if (cont == 9) {
            System.out.println("Matri A es Antisimetrica de Matriz B");
        } else {
            System.out.println("Matri A NO es Antisimetrica de Matriz B");
        }
    }
}
