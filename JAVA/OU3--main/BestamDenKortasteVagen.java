import java.util.*;

public class BestamDenKortasteVagen {
    public static void main(String[] args) {
        Scanner    in = new Scanner (System.in); 
        in.useLocale (Locale.US);

        // mata in uppgifter on antalet stationer.
        System.out.print ("antalstationer i zon 2: ");
        int    antalStationerZ2 = in.nextInt(); 
        System.out.print ("Antalet stationer i zon 3: ");
        int    antalStationerZ3 = in.nextInt(); 

        double[] []    b = new double [antalStationerZ2 + 1 ] [antalStationerZ3 + 1 ];
        double[]    a = new double [antalStationerZ2 + 1];
        double[]    c = new double [antalStationerZ3 + 1];
        
        // mata in längder mellan stationer.
        for (int zon2 = 1; zon2 <= antalStationerZ2; zon2++ ){
            System.out.println ("Avstånd mellan station X till zon2 stationen: " + zon2);
            a [zon2] = in.nextInt(); 

        for (int zon3 = 1; zon3 <= antalStationerZ3; zon3++){
            System.out.println ("Avstånd mellan zon2 station " + zon2 + "till zon3 stationen " + zon3);
            b[zon2] [zon3] = in.nextInt(); 
            }
        }

        for (int zon3 = 1; zon3 <=antalStationerZ3; zon3++){
            System.out.println ("Avstånd mellan zon3 station " + zon3 + "till stationen Y ");
            c [zon3] = in.nextInt();
        }
            
            System.out.println( DenKortasteVagen.langd (a, b, c)); 
    }
}


