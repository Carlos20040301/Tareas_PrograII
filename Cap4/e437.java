import java.util.Scanner;

public class e437 {

    public static void main(String[] args) {
        
        long f=1;
        int n;
        try (Scanner ent = new Scanner(System.in)) {
            System.out.print( "Ingresá un número: " );
            n = ent.nextInt();
        }
        for (int i = n; i > 0; i--) {
            f = f * i;
        }
        System.out.println("El factorial de  " + n + " es: " + f);
    }
}
