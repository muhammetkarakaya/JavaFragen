package forLoops;

public class CharInForLoop {
    public static void main(String[] args) {
        for (char i = 'f'; i > 'a'; i--) {
            System.out.print(i + " ");
            i--;

        }
    }
}
//burada alttaki tekrar azaltana dikkat ediyoruz.
//azaltip tekrat for a gidiginde, biliyoruz ki önce i-- den baslar.