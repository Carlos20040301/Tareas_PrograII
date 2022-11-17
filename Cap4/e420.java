// Ejer 4.20
// Calculadora de Salario

import java.util.Scanner;

public class e420 
{
    public static void main(String[] args)
    {
  
        Scanner ent = new Scanner(System.in);

        int emp = 1,h;
        double s,t;

        while ( 10 >= emp)
        { 
            System.out.printf("\nCuantas horas trabajo el empleado"+emp+": ");

            h = ent.nextInt();

            System.out.printf("\nCual es el salario del empleado"+emp+": ");
            s = ent.nextDouble();

            if ( 40 >= h)
            t = h*s;
            else
            t = 40*s + (h - 40)*(s + s/2);

            System.out.printf("\nEl salario del empleado numero "+emp++ +" es: L"+ t);
        } 

    }
}