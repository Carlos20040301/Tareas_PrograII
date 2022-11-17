import java.util.Scanner;

public class e419 {
    
    public static void main(String[] args) {
        double a,b,c,d,st,t;
        try (Scanner ent = new Scanner(System.in)) {
            
            
   
            System.out.print("Ingrese cuantos ventas hizo del producto A: ");
            a = ent.nextLong();
            
            System.out.print("Ingrese cuantos ventas hizo del producto B: ");
            b = ent.nextLong();

            System.out.print("Ingrese cuantos ventas hizo del producto C: ");
            c = ent.nextLong();

            System.out.print("Ingrese cuantos ventas hizo del producto D: ");
            d = ent.nextLong();

            
      	    }
        st=(a*239.99)+(b*129.75)+(c*99.95)+(d*350.89);

        t=200+st*0.09;

        System.out.print("Su pago total es: "+t);

            
        }
        
}
 
