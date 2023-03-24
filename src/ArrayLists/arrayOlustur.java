package ArrayLists;

import java.util.Arrays;

public class arrayOlustur {
    public static void main(String[] args) {
        //herhangi bir sayiya kadar Array dizilim methodu olusturup yazdırın.
        //{1,1,2,1,2,3,1,2,3,4}
        arrayDiz(7);
    }
    public static void arrayDiz(int n){
        int [] dizilim=new int[(n*(n+1))/2];

        int index=0;
        for (int i = 0; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                dizilim[index]= j;
                index++;
            }
        }
        System.out.println(Arrays.toString(dizilim));

    }

}
