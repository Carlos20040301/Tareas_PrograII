import java.util.Scanner;

public class e216 {
    
    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {
            float n1, n2;
   
            System.out.print("Ingrese el primer número: ");
            n1 = ent.nextInt();
            
            System.out.print("Ingrese el segundo número: ");
            n2 = ent.nextInt();
   
            if (n1 > n2) {
            System.out.printf("El primer número es mayor.");
      	    }
      	    if (n1 < n2) {
            System.out.printf("El segundo número es mayor.");
      	    }
      	    if (n1 == n2) {
            System.out.printf("Son Iguales.");
      	    }
            
        }
        
    }
 }
