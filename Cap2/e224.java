import java.util.Scanner;

public class e224 {
    
    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {
            int n1, n2,n3,n4,n5;
   
            System.out.print("Ingrese el primer número: ");
            n1 = ent.nextInt();
            
            System.out.print("Ingrese el segundo número: ");
            n2 = ent.nextInt();
            
            System.out.print("Ingrese el tercer número: ");
            n3 = ent.nextInt();
            
            System.out.print("Ingrese el cuarto número: ");
            n4 = ent.nextInt();
            
            System.out.print("Ingrese el quinto número: ");
            n5 = ent.nextInt();
            
            
   
   
            if (n1 > n2 && n1 > n3 && n1> n4 && n1>n5) {
            System.out.printf(n1+" es el mayor.\n");
      	    }else{
	      	    if (n1 < n2 && n2 > n3 && n2> n4 && n2>n5) {
		    System.out.printf(n2+" es el mayor.\n");
	      	    }else{
		      	    if (n3 > n2 && n1 < n3 && n3> n4 && n3>n5) {
			    System.out.printf(n3+" es el mayor.\n");
		      	    }else{
			      	    if (n4 > n2 && n4 > n3 && n1 < n4 && n4>n5) {
				    System.out.printf(n4+" es el mayor.\n");
			      	    }else{
				      	    if (n5 > n2 && n5 > n3 && n5> n4 && n1<n5) {
					    System.out.printf(n5+" es el mayor.\n");
				      	    }
			      	    }
		      	    }
	      	    }
      	    }
      	    
      	    if (n1 < n2 && n1 < n3 && n1< n4 && n1<n5) {
            System.out.printf(n1+" es el menor.\n");
      	    }else{
	      	    if (n1 > n2 && n2 < n3 && n2 < n4 && n2 < n5) {
		    System.out.printf(n2+" es el menor.\n");
	      	    }else{
		      	    if (n3 < n2 && n1 > n3 && n3 < n4 && n3 < n5) {
			    System.out.printf(n3+" es el menor.\n");
		      	    }else{
			      	    if (n4 < n2 && n4 < n3 && n1 > n4 && n4 < n5) {
				    System.out.printf(n4+" es el menor.\n");
			      	    }else{
				      	    if (n5 < n2 && n5 < n3 && n5 < n4 && n1> n5) {
					    System.out.printf(n5+" es el menor.\n");
				      	    }
			      	    }
		      	    }
	      	    }
      	    }
}
} 
}

