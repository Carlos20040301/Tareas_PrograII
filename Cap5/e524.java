import java.util.Scanner;

public class e524
{
    public static void main(String[] args)
    {
        try (Scanner ent = new Scanner(System.in)) {
        System.out.print("Cuan grande quiere el rombo: ");
        int c = ent.nextInt();

        for(int l=0; l<=c; l++)
        {
            for(int v=c-l; v>0; v--){
                System.out.print(" ");
            }
            for(int v=0; v<l; v++){
                System.out.print(" *");
            }
            System.out.println("");
        }
            for(int l=0; l<=c; l++)
            {
                for(int v=0; v<=l; v++)
                {
                    System.out.print(" ");
                }
                for(int v=c-l-1; v>0; v--)
                {
                    System.out.print(" *");
                }
                    System.out.println("");
            }
    }   
}
}
 