import java.util.Scanner;

public class e215 {
    
    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {
            float n1, n2, suma,resta,divi,multi;
   
            System.out.print("Ingrese el primer número: ");
            n1 = ent.nextInt();
            
            System.out.print("Ingrese el segundo número: ");
            n2 = ent.nextInt();
   
            suma = n1 + n2;
	    resta = n1-n2;
            multi = n1*n2;
            divi= n1/n2;
            
            System.out.println("\n La suma es: " + suma);
            System.out.println("\n La resta es: " + resta);
            System.out.println("\n La multiplicación es: " + multi);
            System.out.println("\n La división es: " + divi);
        }
        
    }
 }
