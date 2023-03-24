package arrayLists;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        //  Verilen 2 katli bir array’de her bir inner array’in  ilk ve son elementlerinin
        // toplaminini yazdiran bir method olusturun
        int[][] array = {{1, 3, 5}, {2, 6}, {8, 0, 9}, {3, 5, 4}, {4,5,7,3}};
        ilkVeSonElemanToplami(array);
    }

    public static void ilkVeSonElemanToplami(int[][] arr) {
        int toplam = 0;
        for (int[] inner : arr
        ) {
            toplam += inner[0] + inner[inner.length - 1];
        }
        System.out.println("Array'deki ilk ve Son indexler toplami: " + toplam);
    }
}
