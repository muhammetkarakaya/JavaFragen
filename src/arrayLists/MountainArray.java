package arrayLists;

import java.util.Arrays;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7, 5, 8, 3};
        mountainControl(arr);
    }
    public static void mountainControl(int[]array){
        int max=array[0]; boolean sonuc=true;
        int index=0;
        for (int i = 1; i < array.length ; i++) {
            if(array[i]>max){
                max=array[i];
                index = i;
            }
        }
        for (int i = 0; i <index ; i++) {
            if (array[i] < array[i + 1]) {
                continue;
            } else {
                sonuc = false;
                break;
            }
        }
        if(sonuc) {
            for (int i = index; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    continue;

                } else {
                    sonuc = false;
                    break;
                }
            }
        }
        if (sonuc){
            System.out.println(Arrays.toString(array)+" == Mountain Arraydir");

        }else {
            System.out.println(Arrays.toString(array)+" == Array Mountain Degildir");

        }
    }
}
