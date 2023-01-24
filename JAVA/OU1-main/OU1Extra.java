import java.util.*;  // Scanner, Locale

import javax.lang.model.util.ElementScanner14;

class Temperaturer 
{
    public static void main (String[] args)
    {
        System.out.println ("TEMPERATURER\n");

        // inmatningsverktyg
        Scanner    in = new Scanner (System.in); 
        in.useLocale (Locale.US);

        // mata in uppgifter on antalet veckor och antalet mätningar 
        System.out.print ("antalet veckor: ");
        int    antalVeckor = in.nextInt(); 
        System.out.print ("antalet mätningar per vecka: ");
        int    antalMatningarPerVecka = in.nextInt(); 

        // plats att lagra temperaturer
        double[] []    t = new double[antalVeckor + 1 ] [antalMatningarPerVecka + 1 ]; 
        /* En array med antalVeckor+1 row och antalMatningarPerVecka + 1 column. Dvs rad med positioner 0 och columner med positioner 0 kommer vara töm.*/

        // mata in temperaturerna 
        for (int vecka = 1; vecka <= antalVeckor; vecka++ )
        {
            System.out.println("temperaturer - vecka " + vecka + ":");
            for (int matning = 1; matning <= antalMatningarPerVecka; matning++)
                t[vecka] [matning] = in.nextDouble (); 
        }
        System.out.println ();

        //visa temperaturerna
        System.out.println("temperaturerna:");
        for (int vecka = 1; vecka <= antalVeckor; vecka++)
         {
             for (int matning = 1; matning <= antalMatningarPerVecka; matning++)
                 System.out.print (t[vecka] [matning]+ " "); /* första utskrift är t[1] [1]. */
             System.out.println ();
         }
         System.out.println ();

         // den minsta, den största och medeltemperaturen - veckovis
         double []    minT = new double[antalVeckor + 1]; 
         double []    maxT = new double[antalVeckor + 1]; 
         double []    sumT = new double[antalVeckor + 1]; 
         double []    medelT = new double[antalVeckor + 1];
         
         for (int vecka = 1; vecka <= antalVeckor; vecka++)
         {
            minT [vecka] = t[vecka] [1]; // minT[vecka]. I denna array lagras vekornas första temperaturmätning på separata posioner för varje vecka. 
            maxT [vecka] = t[vecka] [1];
            sumT [vecka] = t[vecka] [0]; // sumT[vecka] är tom från början. 

             for (int matning = 1; matning <= antalMatningarPerVecka; matning++)
             {
                 if (minT [vecka] > t[vecka] [matning] ) // Här kollas alla temperatur mätningar för vecka [vecka] och den minsta teperaturen lagras i arrey minT [vecka] veckovis. 
                 {
                     minT[vecka] = t[vecka] [matning];
                 }

                 if (maxT [vecka] < t[vecka] [matning] ) /* Här bestäms den högsta temperaturen veckovis och 
                 de högsta temperaturer för varje vecka lagras på separata prositioner beroede på veckan. */   
                 {
                     maxT[vecka] = t[vecka] [matning];
                 }

                 sumT[vecka] += t[vecka] [matning]; // Här summeras temperatur veckovis och lagras på separata prositioner beroede på veckan.
                 medelT [vecka] = sumT[vecka] / matning; // ""
             }
             System.out.println("Vecka "+ vecka + " mista temperatur: " + minT[vecka]);
             System.out.println("Vecka "+ vecka + " storsta temperatur: " + maxT[vecka]);
             System.out.println("Summan av vecka "+ vecka + " temperaturer: " + sumT[vecka]);
             System.out.println("Medeltemperatur for vecka "+ vecka + " are: " + medelT[vecka] + "\n") ;
         }

         // den minsta, den största och medeltemperaturen -helamätperioden
         // koden ska skrivas här
         double    minTemp = minT[1];
         double    maxTemp = maxT[1];
         double    sumTemp = sumT[0];
         double    medelTemp = 0;
         double    medelSum = 0; 

         for (int vecka = 1; vecka <= antalVeckor; vecka++)
         {  
            if (minTemp > minT [vecka]) // Här jämförs de mista temperaturer från varje vecka. För att hitta den mista för helamätperioden
            {
                minTemp = minT [vecka]; // Den mista sparas på variabel minTemp. 
            }

            if (maxTemp < maxT [vecka])
            {
                maxTemp = maxT [vecka]; 
            }

            sumTemp += sumT[vecka]; // Här sumeras summan av temperaturer från varje vecka. 
            medelSum += medelT[vecka]; // Summan av medel temperaturer för perioden    
            medelTemp = medelSum  / vecka; // Här räknas medeltemperatur för perioden genom att dela summan av medeltemperaturer för varje vecka med antal veckor. 
        }
         // visa den minsta, den största och medeltemperaturen i hela mätperioden
         //koden ska skrivas här
         System.out.println("Periodens minsta temperatur: "+ minTemp);
         System.out.println("Periodens hogsta temperatur: " + maxTemp);
         System.out.println("Temperatur summan for perioden: " + sumTemp);
         System.out.println("Periodens medeltemperatur: " + medelTemp + "\n") ;
        }
    
}
