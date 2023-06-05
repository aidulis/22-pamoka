public class Programa {
    public static void main(String[] args) {

        String s1 = "Penktadienis";
        String s1Pakartotinai = tekstasTrisKartusAtskirtasTarpais(s1);
        System.out.println("s1Pakartotinai = " + s1Pakartotinai);

        String s2 = "Šiandien aš programuoju";
        String s2Pakartotinai = tekstasTrisKartusAtskirtasTarpais(s2);
        System.out.println("s2Pakartotinai = " + s2Pakartotinai);
    }

    public static String tekstasTrisKartusAtskirtasTarpais(String tekstas){
        return tekstas + " " + tekstas + " " + tekstas;
    }
}
