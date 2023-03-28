package forLoops;

import java.util.Scanner;

public class ForFrage {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic degeribi giriniz");
        int bas= scan.nextInt();
        System.out.println("Lutfen bitis degeribi giriniz");
        int bit= scan.nextInt();

        int sayiToplami=0;

        if (bit<bas){
            System.out.println("Baslangic degeri bitis degerinden kucuk olmalidir");
        }else {
            for (int i = bas; i <=bit ; i++) {

                // sayiToplami = sayiToplami + i;

                sayiToplami +=i;
            }
        }

        System.out.println("Sayilarin toplami : " + sayiToplami);
    }
}
