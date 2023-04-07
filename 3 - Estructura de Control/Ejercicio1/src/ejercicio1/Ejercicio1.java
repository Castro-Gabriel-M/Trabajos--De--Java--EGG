
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num;
        num = leer.nextByte();
        
        double var;
        var = num / 2;
        double resto;
        resto = (var * 2) - num;
        
        if(resto == 0) {
            System.out.println("El numero es PAR");
        } else {
            System.out.println("El numero es IMPAR");
        }   
    }
}
