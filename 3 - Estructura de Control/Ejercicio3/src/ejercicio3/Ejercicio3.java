package ejercicio3;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.ArrayBufferView.length;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase de 8 letras");
        int cont;
        cont = 0;
        String frase;
        int log;
        
         do {
            cont = cont + 1;
            frase = leer.next();
            log = frase.length();
            
            if (log == 8) {
            System.out.println("CORRECTA");
            break;
        } else {
            System.out.println("INCORRECTA");
        }
        } while (cont < 3);
    }
}
