package ArrayLists;

public class canBalanceArray {
    public static void main(String[] args) {
        //bos olamayan bir array'in dengeli olup olmadıgını kontrol edip,true yada false döndürün
        int[]dizi={1,1,1,2,1};
        int[] sayi={1,2,3,4,2,0};
        System.out.println("Dizi dengeli mi: "+dengeliMi(dizi));
        System.out.println("Dizi dengeli mi: "+dengeliMi(sayi));
    }
    public static boolean dengeliMi(int []arr){
        int toplam=0;  boolean result = false;

        for (int each:arr
        ) {
            //arrayin tum elemanlarını toplarız.İkiye böldügümüzde bize sag ve sol tarafın toplamlarını verecektir.
            toplam += each;
        }

        int kismiToplam=0;//sag ya da sol tarafı toplayalim
        int i=0;
        while (i< arr.length/2){//

            kismiToplam += arr[i];

            i++;
            if (2 * kismiToplam == toplam){//kismiToplam degeri arrayi böldümüz noktadan geriye kalan elemanlarin
                // toplamıysa diğer tarafta ayni degere sahip olacaktır.bu degeri ikiyle carpıp toplama esitlersek dengelimidir bakalım
                result= true;
            }else {
                result=false;
            }
        }
        return result;
    }
}
