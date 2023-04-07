package ejercicio3;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese un tamaño para el vector");
        int tam = 20;
        int[] vector = new int[tam];

        LlenarVector(vector, tam);
        ContadorDigitos(vector, tam);
    }

    public static void LlenarVector(int[] vector, int tam) {
        for (int i = 0; i < tam; i++) {
            vector[i] = (int) (Math.random() * 100000);
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println();
    }

    public static void ContadorDigitos(int[] vector, int tam) {
        String auxiliar;
        int digitos;
        int contD1, contD2, contD3, contD4, contD5;
        contD1 = 0;
        contD2 = 0;
        contD3 = 0;
        contD4 = 0;
        contD5 = 0;

        for (int i = 0; i < tam; i++) {
            auxiliar = Integer.toString(vector[i]);
            digitos = auxiliar.length();

            switch (digitos) {
                case 1:
                    contD1 = contD1 + 1;
                    break;
                case 2:
                    contD2 = contD2 + 1;
                    break;
                case 3:
                    contD3 = contD3 + 1;
                    break;
                case 4:
                    contD4 = contD4 + 1;
                    break;
                case 5:
                    contD5 = contD5 + 1;
            }
        }
        
        System.out.println("CLASIFICACION POR DIGITOS");
        System.out.println("1 Digito: "+contD1);
        System.out.println("2 Digito: "+contD2);
        System.out.println("3 Digito: "+contD3);
        System.out.println("4 Digito: "+contD4);
        System.out.println("5 Digito: "+contD5);
    }
}
