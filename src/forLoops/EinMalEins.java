package forLoops;

public class EinMalEins {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) { // satirlar

            for (int j = 1; j <=10 ; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println(""); // bir satirdaki tum sutunlar bitince alt satira geciyor
        }
    }
}
