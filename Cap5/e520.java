import java.util.Random;

public class e520 
{
    public static void main(String args[])
    {  
 
        Random r= new Random();
 


        
        int Num;

        for ( int i = 1; i <= 2000; i++)
        {   
            Num =  1 + r.nextInt(10);
            
            System.out.printf("%3d", Num);

            System.out.print( (0 == i % 5)? "\n":"" );
        
        }
  
    }  
    
}
