package forLoops;

public class Nesdted {
    public static void main(String[] args) {

        for (int i = 1; i <10 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);

            }
            System.out.println("");

        }


        String inp="Ali gel okul acildi.";
        String out="";
        for (int i = inp.length()-1; i >=0; i--) {
            out=out+inp.charAt(i);

        }
        System.out.println(out);
    }
}

//dikdörtgen ise; i ve j yi satir ve sütuna göre yapiyoruz.
//ücgen ise; önce satiri olusturuyoruz, icerideki sütunlar satira yani i ye bagli oluyor.
