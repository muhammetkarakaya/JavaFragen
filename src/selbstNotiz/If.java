package selbstNotiz;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        //Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        //“Sayi 5’in tam kati” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein ");

        vielfachesFuenf(scan.nextInt());


        int num = scan.nextInt();
        if (num % 5 == 0) {
            System.out.println("Nummer ist ein Vielfaches von 5");
        }
    }

    private static void vielfachesFuenf(int nextInt) {
        if (nextInt % 5 == 0) {
            System.out.println("Nummer ist ein Vielfaches von 5");
        } else {
            System.out.println("Nummer ist NICHT Vielfaches von 5");
        }
    }
}
