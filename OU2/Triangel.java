import java.util.Scanner;

  class Triangel {
    public static void main(String[] args) {
        Scanner    in = new java.util.Scanner  (System.in);
        in.useLocale (java.util.Locale.US);

        Double    trinagelSida1;
        Double    triangelSida2; 
        Double    triangelSida3; 
        Double    alfa, alfa2, alfa3; 

        System.out.println("1. Beräkna triangels area");
        System.out.println("2. Beräkna triangels omkrets");
        System.out.println("3. Använd Cosinusssatsen för en triangel");
        System.out.println("4. Använd Areasatsen för en triangel");
        System.out.println("5. Beräkna triangels bisektris\n");
        System.out.println(" Vad vill du beräkna. Ange med sifra");
        int    menyNum  = in.nextInt(); // we use method nextInt which is in class Scanner. 

        switch (menyNum) {
            case 1:
                System.out.println("Mata in först triangels bas och höjden.");
                trinagelSida1= in.nextDouble();
                Double    height = in.nextDouble(); 
                System.out.println(TriangelFormler.triangelArea(trinagelSida1, height));
                break;
            
            case 2:
                System.out.println("Mata först in triangels sidor.");
                trinagelSida1 = in.nextDouble();
                triangelSida2 = in.nextDouble(); 
                triangelSida3 = in.nextDouble(); 
                System.out.println (TriangelFormler.triangelOmkrets(trinagelSida1, triangelSida2, triangelSida3));
                break; 

            case 3:
                System.out.println("Mata in förts triangels sidor sen dens vinkel.");
                trinagelSida1 = in.nextDouble();
                triangelSida2 = in.nextDouble(); 
                alfa = in.nextDouble(); 
                System.out.println (TriangelFormler.cosinussatsen(trinagelSida1, triangelSida2, alfa));
                break; 

            case 4:
                System.out.println("Mata in först triangels sidor och dens vinkel.");
                trinagelSida1 = in.nextDouble();
                triangelSida2 = in.nextDouble(); 
                alfa = in.nextDouble(); 
                System.out.println (TriangelFormler.areasatsen(trinagelSida1, triangelSida2, alfa));
                break; 
    
            case 5:
                System.out.println("Mata in först alla längder av triangels sidor och deras vinkelar.");
                trinagelSida1 = in.nextDouble();
                triangelSida2 = in.nextDouble(); 
                triangelSida3 = in.nextDouble(); 
                alfa = in.nextDouble(); 
                alfa2 = in.nextDouble();
                alfa3 = in.nextDouble(); 
                System.out.println (TriangelFormler.bisektris(trinagelSida1, triangelSida2, alfa));
                System.out.println (TriangelFormler.bisektris(triangelSida2, triangelSida3, alfa2));
                System.out.println (TriangelFormler.bisektris(triangelSida3, triangelSida3, alfa3));
                break;

            default:
                System.out.println("Wrong number");
                break;
        }
    }
}