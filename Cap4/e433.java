import java.util.Scanner;

public class e433
{
    public static void main(String[] args)
    {
        try (Scanner ent = new Scanner(System.in)) {

        int n;
        int d = 2;
        System.out.print("Cuantos multiplos quiere ver: ");
        n = ent.nextInt();
        
        System.out.println(d);
        for(int c=1; c<=n;c++){
        
        
            d+=2;
            
            System.out.println(d);
        }
    }
}
}