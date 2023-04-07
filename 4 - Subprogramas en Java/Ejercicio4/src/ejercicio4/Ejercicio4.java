package ejercicio4;
import static java.lang.Math.floor;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num = leer.nextByte();
        
        numerosPrimos(num);
        
        System.out.println("True = Es Numero Primo");
        System.out.println("False = No es Numero Primo");
        System.out.println(numerosPrimos(num));
    }
//-----------------------------------------------------------    
    public static boolean numerosPrimos(int num){
        boolean retorno;
        int cont = 0;
        
        double var1, var2, n;
        n = 2;
        var1 = floor(sqrt(num));
            
        do {
            
            var2 = num%n;
            n = n + 1;
            
            if (var2 == 0){
                retorno = false;
            } else {
                retorno = true;
            }
            
        } while (var2 != 0 && n < var1);
        
        return retorno;
        }
//----------------------------------------------------------- 
    }


