public class Programa {
    public static void main(String[] args) {

        int rezultatas1 = apskaiciuotiDvigubaSuma(25,37);
        System.out.println("rezultatas1 = " + rezultatas1);

        int rezultatas2 = apskaiciuotiDvigubaSuma(-200,100);
        System.out.println("rezultatas2 = " + rezultatas2);

    }

    public static int apskaiciuotiDvigubaSuma(int sk1, int sk2){
        return 2 * (sk1 + sk2);
    }
}
