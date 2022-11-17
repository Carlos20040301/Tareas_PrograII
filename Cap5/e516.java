import java.util.Scanner;

public class e516 
{
    public static void main( String args[])
    {

        Scanner ent = new Scanner(System.in);

        int n;
        int c=1;

        while ( c <= 5 )
        {         

            System.out.print("Escriba un número entre 1 y 30: ");
            n = ent.nextInt();

            if ((1 <= n) && ( 30 >= n))
            {     

                for ( int i = 1; i <= n; i++ )
                System.out.print("*");

                System.out.println();

                c++;
            }       
        }  
    }
}
