import java.util.Scanner;

public class dairAlanı {
    public static void main(String[] args) {
        double r;
       double pi = 3.14;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin capini giriniz: ");

        r = inp.nextDouble();

        double alan = pi * r * r;
        double cevre = pi * r * 2;

        System.out.println("Dairenin alani:  " + alan);
        System.out.println("Dairenin cevresi:  " + cevre);


    }
}
