package ejercicioextra1;
import java.util.Scanner;

public class EjercicioExtra1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad en minutos");
        int min = leer.nextInt();
        int dia,horas;
        
        horas = min/60;
        dia = horas/24;
        
        System.out.println("Dia: " +dia);
        System.out.println("Horas: " +(horas%24));
         System.out.println("Minutos: " +(min%60));
    }

}
