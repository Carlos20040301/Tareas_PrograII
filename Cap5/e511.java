import java.util.Scanner;
public class e511{

public static void main(String[] args) {
    try (Scanner ent = new Scanner(System.in)) {
    int max, n, c;
    int ma=0;
    
 
    System.out.println("Ingresa cuantos números vamos a ingresar: ");
    max= ent.nextInt();
 
    for(c = 0;c < max;c++ ){
        System.out.println("Escribe un número: ");
        n = ent.nextInt();
 
        if(c==0){
           ma=n;
         }
 
        if(n>ma)
        {
            ma=n;
        }
    }
    System.out.println("El mayor es: "+ma);
}
}
}
