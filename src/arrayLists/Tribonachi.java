package arrayLists;

import java.util.Scanner;

public class Tribonachi {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        //Tribonacci dizisi, genel olarak fibonacci dizisinin üçlü hali olarak düşünülebilir.
        //0 – 1 – 1 – 2 – 4 – 7 – 13 – 24 – 44 –81 …..
        //Diye devam eden dizidir.
        System.out.println("kac adet Tribonacci dizisi görmek istiyorsunuz : ");
        int sayi = sc.nextInt();
        //İlk olarak birinci, ikinci , üçüncü ve dorduncu sayılarımızı tanımlıyoruz ve değerlerini yazıyoruz.
        int birinci = 0;
        int ikinci = 1;
        int ucuncu = 1;
        int next = birinci+ikinci+ucuncu;
        //Hesaplayacağımız algoritmada ilk 4 terim yazılmayacağı için bu terimleri yazdırması için
        // System.out.println kodunu kullanıyoruz.

        System.out.println("Tribonacci Dizisi :");
        System.out.print(birinci + " " + ikinci + " " + ucuncu + " "+next+" ");

        while (sayi  > 4) {
            sayi--;
            birinci=ikinci;
            ikinci = ucuncu;
            ucuncu = next;
            next = birinci + ikinci + ucuncu ;
            System.out.print(next + " ");
        }
    }

}
