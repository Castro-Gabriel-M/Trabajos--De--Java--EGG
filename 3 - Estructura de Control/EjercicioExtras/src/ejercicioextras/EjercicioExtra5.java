package ejercicioextras;
import java.util.Scanner;

public class EjercicioExtra5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la Categoria del Socio");
        System.out.println("1: Clase A");
        System.out.println("2: Clase B");
        System.out.println("3: Clase C");
        int num;
        num = leer.nextByte();
        
        System.out.println("Ingrese el monto del tratamiento");
        int cost;
        cost = leer.nextInt();
        
        double descA;
        descA = cost * (50/100);
        double descB;
        descB = cost * (35/100);
        
        switch(num){
            case 1:
                System.out.println("Costo con Descuento: "+descA);
                break;
            case 2:
                System.out.println("Costo con Descuento: "+descB);
                break;
            case 3:
                System.out.println("No hay descuento el total es: "+cost);
                break;
        }
    }
}
