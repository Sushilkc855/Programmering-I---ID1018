import java.util.Scanner;

class EnTriangelOchDessCirkel {
    public static void main(String[] args) {
        Scanner    in = new java.util.Scanner  (System.in);
        in.useLocale (java.util.Locale.US);
        System.out.println("Mata in triangels sidor för att få radeien av omskriven cirkel kring triangeln");
        System.out.println(", samt radien av den cirkel som är inskriven i triangeln");

        double    sida1 = in.nextDouble();
        double    sida2 = in.nextDouble();
        double    sida3 = in.nextDouble();

        double    radieinskriven = TriangelFormler.inskrivenCirkelRadie(sida1, sida2, sida3);
        double    radieOmskriven = TriangelFormler.utskrivenCirkelRadie(sida1, sida2, sida3);

        System.out.println("Radien för Inskriven cirkel: " + radieinskriven);
        System.out.println("Radien för Omskriven cirkel: " + radieOmskriven);   
    }
}
