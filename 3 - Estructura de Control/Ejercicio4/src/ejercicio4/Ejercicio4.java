package ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase que su primera letra sea A");
        String frase;
        int cont;
        cont = 0;
        String letra;
        
        do {
            cont = cont + 1;
            frase = leer.next();
            letra = frase.substring(0, 1);
            
            if ("a".equals(letra)) {
            System.out.println("CORRECTA");
            break;
        } else {
            System.out.println("INCORRECTA");
        }
        } while (cont < 3);
    }
}
