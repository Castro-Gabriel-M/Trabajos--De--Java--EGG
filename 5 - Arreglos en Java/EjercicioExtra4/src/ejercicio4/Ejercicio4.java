package ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        double[] vector = new double[10];
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("NOTAS Alumno N°"+(i+1));
            System.out.println("Notas por Trabajos Practicos");
            nota1 = leer.nextInt();
            nota2 = leer.nextInt();
            System.out.println("Notas por Parciales");
            nota3 = leer.nextInt();
            nota4 = leer.nextInt();
            
            double promedio = nota1*(10/100) + nota2*(15/100) + nota3*(25/100) + nota4*(50/100);
            System.out.println(+promedio);
            vector[i] = promedio;
            
            if(vector[i] >= 7){
                System.out.println("Alumno N°"+(i+1)+" esta APROBADO");
            } else{
                System.out.println("Alumno N°"+(i+1)+" esta DESAPROBADO");
            }
            System.out.println();
            promedio = 0;
        }
    }
}
