package ArrayLists;

import java.util.ArrayList;

public class forEach {
    public static void main(String[] args) {
        //Array'in icerdigi kelimeleri inceleyin.uzunlugu cift olanların ilk yarısını,
        //tek olanların son yarısını yazdırın

        String[] stringArr = {"Java", "kendine", "iyi","bak"};
        ArrayList<String> newList = new ArrayList<>();
        for (String each : stringArr) {
            int length = each.length();
            if (length % 2 == 0) {
                newList.add(each.substring(0, length/2));
            } else {
                newList.add(each.substring(length/2));
            }
        }
        System.out.println(newList);
    }
}
