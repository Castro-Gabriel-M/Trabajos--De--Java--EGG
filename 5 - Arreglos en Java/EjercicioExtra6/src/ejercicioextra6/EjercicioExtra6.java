package ejercicioextra6;

import java.util.Scanner;

public class EjercicioExtra6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String[][] matriz = new String[20][20];

        do{
        
        System.out.println("Ingrese una palabra");
        String palabra = leer.next();
        int log = palabra.length();

        LlenarEspacios(matriz, palabra);
        
        } while()
    }
    
    public static void LlenarEspacios(String[][] matriz, String palabra){
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                
                
            }
        }
    }
}
