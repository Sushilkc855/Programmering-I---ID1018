//Standard input Operations on primitive values
import java.util.*;

class Forelasning3
{
    public static void main(String[] args)
    { 
        Scanner   in = new java.util.Scanner  (System.in); // kan inte använda i en annan method. Tar in class som heter Scanner.<
        in.useLocale (java.util.Locale.US); // TO use the usa system.  new means skapa ett odjekt av klassen Scanner. Bind objekt to standard system
        // Med in kan man komma åt de objekt som finns scanner. variabel in lagrar adresser. 
        // Tilldelnings operatorn tilldelar objekts adresser till variabel in. 





        //int    n = in.nextInt (); // we use method nextInt which is in class Scanner. 
        //double   m = in.nextDouble ();
      //  int    n = 12;
        //int   m = n * n;
     //   System.out.println (n * m );

    /* String    s1 = in.next ();
     String    s2 = in.next ();
     in.nextLine();
     System.out.println(s1);
     System.out.println(s2);

      String   s = in.nextLine(); // man kan inte öagra tecken tecken sen text eftersom den läster enter från tangenbördet som text. 

      System.out.println(s);*/
/*
      Short    G1 = 12.5;
      Short    G2 = 4.0; 
      Short    G = G1 + G2; 
      System.out.println(g);
 */
    
 
 //int    a = 2; 
   //   a++; // prefix och profix. ++a och a++
     // System.out.println(a);

     int    twoD [] [] = { {2, 3, 4}, {2, 3, 5}, {2, 4 , 4} };
     System.out.println(twoD);
     
     for (int i= 0; i < twoD.length; i++){
      for (int j= 0; j < twoD.length; j++)
         System.out.println( twoD[i][j]+ " ");     
     }

    } 
  }