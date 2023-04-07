package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int tam, num;
//-----------------------------------------------------------------------------------        
        System.out.println("Ingrese el tamaño del vector");
        tam = leer.nextInt();
        int[] vector = new int[tam];
        
        LlenarMatriz(vector, tam);
//-----------------------------------------------------------------------------------        
        System.out.println("¿Que numero desea buscar?");
        num = leer.nextInt();
        
        BuscarNumero(vector, num, tam);
//-----------------------------------------------------------------------------------  
    }
//-----------------------------------------------------------------------------------    
    public static void LlenarMatriz(int[] vector, int tam){
        
        for (int i = 0; i < tam; i++) {
            vector[i] = (int)(Math.random()*10);
        }
    }
//-----------------------------------------------------------------------------------    
    public static void BuscarNumero(int[] vector, int num, int tam){
        int cont = 0;
        
        for (int i = 0; i < tam; i++){
            if(vector[i]==num){
                cont = cont + 1;
                System.out.print("Posicion del Vector: "+vector[i+1]);
                System.out.println("");
            }
            if(i == tam-1){
                System.out.println("Cantidad de veces repetido: "+cont);
            }
        }
        System.out.println("");
    }
//-----------------------------------------------------------------------------------    
}
