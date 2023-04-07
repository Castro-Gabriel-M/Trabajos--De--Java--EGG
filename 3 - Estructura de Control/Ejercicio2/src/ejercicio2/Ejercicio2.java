package ejercicio2;
import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String clave;
        clave = "eureka";
        String frase;
        int cont;
        cont = 0;
        
        do {
            
            cont = cont + 1;
            System.out.println("Ingrese la Clave");
            frase = leer.next();
            
            if ("eureka".equals(frase)) {
            System.out.println("Clave CORRECTA");
            break;
        } else {
            System.out.println("Clave INCORRECTA");
        }
            
        } while (cont < 3);
    }
}
