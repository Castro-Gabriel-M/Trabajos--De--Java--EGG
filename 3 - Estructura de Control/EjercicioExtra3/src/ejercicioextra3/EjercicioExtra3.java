package ejercicioextra3;
import java.util.Scanner;

public class EjercicioExtra3 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una letra");
        String letra = leer.next();
        
        if ("a".equalsIgnoreCase(letra) || "e".equalsIgnoreCase(letra) || "i".equalsIgnoreCase(letra) || "o".equalsIgnoreCase(letra) || "u".equalsIgnoreCase(letra)){
            System.out.println("La letra es una Volcal");
        } else System.out.println("La letra es una Consonante");
    }
}
