public class Programa {
    public static void main(String[] args) {

        double rezultatas1 = apskaiciuotiNamoPerimetra(17.35,18,20.47,16.37);
        System.out.println("rezultatas1 = " + rezultatas1);

        double rezultatas2 = apskaiciuotiNamoPerimetra(2,4,2,4.1);
        System.out.println("rezultatas2 = " + rezultatas2);
    }

    public static double apskaiciuotiNamoPerimetra(double sk1, double sk2, double sk3, double sk4){
        return sk1 + sk2 + sk3 + sk4;
    }
}
