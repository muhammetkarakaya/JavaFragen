package arrayLists;

import java.util.Arrays;

public class ArdisikArtan {

        public static void main(String[] args) {
            //Array'in ardısık artan toplamını hesaplayın.
            int[] sayilar = {9, 5, 8, 2, 6, 9, 2, 3, 8, 7};
            System.out.println("Arrayimiz : "+ Arrays.toString(sayilar));
            int a = 0; int[] arrToplam = new int[4];

            int index = 1;

            while (a < arrToplam.length) {
                int toplam = 0;
                for (int i = 0; i <= a; i++) {
                    toplam += sayilar[index- 1 + i];
                }
                arrToplam[a] += toplam;
                a++;
                index += a;
            }
            System.out.println("Ardisik Toplam : "+ Arrays.toString(arrToplam));
        }
    }
