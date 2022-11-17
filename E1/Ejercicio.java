import java.util.Scanner;

public class Ejercicio {
    
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            float n1, n2, suma;
   
            System.out.print("ingrese los dos numero:");
            n1 = entrada.nextFloat();
            n2 = entrada.nextFloat();
   
            suma = n1 + n2;
            System.out.println("\n La suma es: " + suma);
        }
        
    }
 }
