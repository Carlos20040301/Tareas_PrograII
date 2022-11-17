
import java.util.Scanner;

public class prom {
    public static void main(String[] args) {

        System.out.print("Buenas mi pumita vamos a ver si pasa\n");
        System.out.print("                 \n");

        Scanner et = new Scanner(System.in);
        int a, b, c, p, d;
        System.out.print("Primer Nota: ");
        a = et.nextInt();

        System.out.print("Segunda Nota: ");
        b = et.nextInt();

        System.out.print("Tercer Nota: ");
        c = et.nextInt();

        p = (a + b + c) / 3;

        if (p >= 65) {
            System.out.printf("Simon si pasa pumita.");
        }
        if (p <= 65) {
            System.out.printf("Ya hiciste repo? :).\n");
            System.out.print("1.Si     2.No");
            d = et.nextInt();
            if (d == 1) {
                System.out.print("Bueno al menos hay salud :') ");
            }
            if (d == 2) {
                System.out.print("Dele mi loco yo se que si va a pasar");
            }

        }
        et.close();
    }
}