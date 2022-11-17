import java.util.Scanner;

public class e217 {
    
    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {
            int n1, n2,n3,prom;
   
            System.out.print("Ingrese el primer número: ");
            n1 = ent.nextInt();
            
            System.out.print("Ingrese el segundo número: ");
            n2 = ent.nextInt();
            
            System.out.print("Ingrese el tercer número: ");
            n3 = ent.nextInt();
            
            prom=((n1+n2+n3)/3);
            
            System.out.print("La suma es : "+ (n1+n2+n3)+"\n");
            System.out.print("El producto es : "+ n1*n2*n3+"\n");
            System.out.print("El promedio es : "+ prom+"\n");
            
   
   
            if (n1 > n2 && n1 > n3) {
            System.out.printf(n1+" es el mayor.\n");
      	    }else{
	      	    if (n1 < n2 && n2 > n3) {
		    System.out.printf(n2+" es el mayor.\n");
	      	    }else{
		      	    if (n3 > n2 &&  n1 < n3) {
			    System.out.printf(n3+" es el mayor.\n");
		      	    }
	      	    }
      	    }
      	    
      	    if (n1 < n2 && n1 < n3) {
            System.out.printf(n1+" es el menor.\n");
      	    }else{
	      	    if (n1 > n2 && n2 < n3) {
		    System.out.printf(n2+" es el menor.\n");
	      	    }else{
		      	    if (n3 < n2 && n1 > n3) {
			    System.out.printf(n3+" es el menor.\n");
		      	    }}
	      	    }
      	    }
            
        }
        
}
 
