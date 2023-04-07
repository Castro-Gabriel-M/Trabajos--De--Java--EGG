package probleman.pkg3;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class ProblemaN3 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase o texto");
        String frase;
        frase = leer.next();
        
        String fraseMay = toUpperCase(frase);
        String fraseMin = toLowerCase(frase);
        
        System.out.println("Modificando a Mayuscula: " + fraseMay);
        System.out.println("Modificando a Minuscula: " + fraseMin);
    }
}
