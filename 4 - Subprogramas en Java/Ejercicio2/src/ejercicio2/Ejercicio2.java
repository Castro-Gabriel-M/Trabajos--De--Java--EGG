package ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String nombre, opcion;
        int edad;
        
        do {
            
            System.out.println("Ingrese Nombre");
            nombre = leer.next();
            System.out.println("Ingrese Edad");
            edad = leer.nextByte();
            
            System.out.println("Estimado/a: "+nombre+" de Edad: "+edad+" y condicion: "+registro(edad));
            
            System.out.println("¿Desea Salir? S/N");
            opcion = leer.next();
            
        } while(opcion.equalsIgnoreCase("S"));
    }
//-------------------------------------------------------------
    public static String registro(int edad){
        String retorno;
        
        if (edad > 18){
            retorno = "Es mayor de Edad";
        }else {
            retorno = "Es menor de Edad";
        }
        return retorno;
    }
//-------------------------------------------------------------
}
