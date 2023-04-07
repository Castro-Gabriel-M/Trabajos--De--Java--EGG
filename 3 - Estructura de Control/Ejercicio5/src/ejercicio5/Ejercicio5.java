package ejercicio5;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad");
        int cantidad;
        cantidad = leer.nextByte();
        int cont;
        cont = 0;
        int num;        
        
        do {
            System.out.println("Ingrese un numero");
            num = leer.nextByte();
            cont = cont + num;
            System.out.println(+ cont);
        } while(cont < cantidad);
    }
}
