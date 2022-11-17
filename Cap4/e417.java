import java.util.Scanner;

public class e417 {
    
    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {
            int promd,promg, n,ga,di;
            
   
            System.out.print("Ingrese cuantos viajes hizo: ");
            n = ent.nextInt();
            
            int []g=new int[n+2];
            int []d=new int[n+2];
            for(int c=1; c<=n;c++){
                System.out.print("Ingrese cuantos kilometros viajo en su viaje #"+c+": ");
                di=ent.nextInt();
                d[c]=di;
                System.out.print("Ingrese cuantos litros gasolina gastó su viaje #"+c+": ");
                ga=ent.nextInt();
                g[c]=ga;
            }
            promd=d[1];
            promg=g[1];
            System.out.print("Viaje #1 "+d[1]+"Km/"+g[1]+"Lts \n");
            for(int cs=2;cs<n+1;cs++){
                promd=(promd+d[cs])/2;
                promg=(promg+g[cs])/2;
                System.out.print("Viaje #"+cs+" "+d[cs]+"Km/"+g[cs]+"Lts \n");
                
            }

            System.out.print("Usted gastó en promedio: \n");
            System.out.print(promd+"Km/"+promg+"Lts\n");
      	    }
            
        }
        
}
 
