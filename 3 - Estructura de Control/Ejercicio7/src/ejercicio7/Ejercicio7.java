package ejercicio7;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa una cadena de 5 caracteres y que el primer caracter sea X y el ultimo O");
        
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        
       do {
            cont1 = cont1 + 1;
                    
            String frase = leer.next();
            int cant = frase.length();
            
            String Pcar = frase.substring(0, 1);
            String Scar = frase.substring(cant-1, cant);
            
           if(cant == 5 && "x".equalsIgnoreCase(Pcar) && "o".equalsIgnoreCase(Scar)) {
            System.out.println("Secuencia CORRECTA");
            cont2 = cont2 + 1;
        } else {
            System.out.println("Secuencia INCORRECTA");
            cont3 = cont3 + 1;
        } 
       } while(cont1 < 5);
       
       System.out.println("Lecturas Correctas: " + cont2);
       System.out.println("Lecturas Icorrectas: " + cont3);
    }
}
