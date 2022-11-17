import java.util.Scanner;

public class e226 {
    
    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {
            int n1, n2;
   
            System.out.print("Ingrese el primer número: ");
            n1 = ent.nextInt();
            
            System.out.print("Ingrese el segundo número: ");
            n2 = ent.nextInt();
   
            if ((n2%n1)==0){
            	System.out.print(n1+" es múltiplo de "+n2+"\n");
        	}else{
        
        	System.out.print("No es múltiplo"+"\n");
        	}
        	
        	
        
    }
 }
 }
