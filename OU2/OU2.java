import java.util.Scanner;

 class Triangel {

    static double triangelArea (Double bas, Double height) {
        return (bas * height) / 2; 
    }

    static double triangelOmkrets (double sid1, double sid2, double sid3) {
        return (sid1+ sid2+ sid3); 
    }

    // bisektris tar emot två sidor i en triangel och vinkeln(i radianer) mellan dessa sidor.// Metoden returnerar längdenav den motsvarande bisektrisen -den som delar den givnavinkeln// i två lika delar.
    public static double bisektris (double b, double c, double alfa){
        double    p = 2 * b * c * Math.cos (alfa / 2);
        double    bis = p / (b + c);
        return bis;
    }

    public static void main(String[] args) {
        Scanner    in = new java.util.Scanner  (System.in);
        in.useLocale (java.util.Locale.US);

        Double    trinagelSida1;
        Double    triangelSida2; 
        Double    triangelSida3; 
        Double    alfa; 

        System.out.println("1. Beräkna triangels area");
        System.out.println("2. Beräkna triangels omkrets");
        System.out.println("3. Beräkna triangels bisektris\n");
        System.out.println(" Vad vill du beräkna. Ange med sifra");
        int    menyNum  = in.nextInt(); // we use method nextInt which is in class Scanner. 

        switch (menyNum) {
            case 1:
                System.out.println("Mata in triangels bas och höjden.");
                Double    bas = in.nextDouble();
                Double    height = in.nextDouble(); 
                System.out.println(triangelArea(bas, height));
                break;
            
            case 2:
                System.out.println("Mata in triangels sidor.");
                trinagelSida1 = in.nextDouble();
                triangelSida2 = in.nextDouble(); 
                triangelSida3 = in.nextDouble(); 
                System.out.println ( triangelOmkrets(trinagelSida1, triangelSida2, triangelSida3));
                break; 

            case 3:
                System.out.println("Mata in triangels sidor och dens vinkel.");
                trinagelSida1 = in.nextDouble();
                triangelSida2 = in.nextDouble(); 
                alfa = in.nextDouble(); 
                System.out.println (triangelOmkrets(trinagelSida1, triangelSida2, alfa));
                break; 

            default:
                System.out.println("Wrong number");
                break;
        }


    }
}