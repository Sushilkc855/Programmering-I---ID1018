import java.util.*;    // Scanner 
import static java.lang.System.out; 
 
class OperationerMedNaturligaHeltalGivnaSomTeckenstrangar 
{ 
    public static void main (String[] args) 
    { 
        out.println ("OPERATIONER MED NATURLIGA HELTAL GIVNA SOM TECKENSTRANGAR\n"); 
 
        // mata in två naturliga heltal 
        Scanner    in = new Scanner (System.in); 
        out.println ("två naturliga heltal:"); 
        String    tal1 = in.next (); 
        String    tal2 = in.next (); 
        out.println (); 
 
        // addera heltalen och visa resultatet 
        String    summa = addera (tal1, tal2); 
        visa (tal1, tal2, summa, '+'); 
 
        // subtrahera heltalen och visa resultatet 
        // koden här 
    } 
 
    // addera tar emot två naturliga heltal givna som teckensträngar, och returnerar deras 
    // summa som en teckensträng. 
    public static String addera (String tal1, String tal2) 
    { 
        // koden ska skrivas här  
        int length = tal1.length();
        int carry = 0; 
        StringBuilder sb1 = new StringBuilder(); 
        int sum = 0; 

        if (length > tal2.length())
        {
            tal2 = equalLength(length, tal2);
        }
        else{
            length = tal2.length(); 
            tal1 = equalLength(length, tal1);
        }

        for (int i = length - 1; i >= 0; i--)
    {
        // Do school mathematics, compute sum of
        // current digits and carry
        int G = Character.getNumericValue(tal1.charAt(i));
        int h = Character.getNumericValue(tal2.charAt(i));
        sum = G + h + carry;
        System.out.println(sum);
        sb1.append((sum % 10));
        System.out.println(sb1);
        // Calculate carry for next step
        carry = sum / 10;
    }
    if (carry > 0)
        sb1.append((sum % 10));
 
    // reverse resultant String
    sb1.reverse();

        System.out.println(tal1.length() + ", " + tal2.length());
        System.out.println(tal1 + ", " + tal2);

    return sb1.toString(); 
    } 



    public static String equalLength  (int length, String tal)
    {
        StringBuilder sb1 = new StringBuilder(tal);
        while (tal.length() != length)
        {
            sb1.insert(0, "0"); 
            length--; 
        }
        return sb1.toString(); 
    }
    // subtrahera tar emot två naturliga heltal givna som teckensträngar, och returnerar 
    // deras differens som en teckensträng. 
    // Det första heltalet är inte mindre än det andra heltalet. 
    public static String subtrahera (String tal1, String tal2) 
    { 
        // koden ska skrivas här
        return null;  
    } 
 
    // visa visar två givna naturliga heltal, och resultatet av en aritmetisk operation 
    // utförd i samband med hetalen 
 public static void visa (String tal1, String tal2, String resultat, char operator) 
    { 
        // sätt en lämplig längd på heltalen och resultatet 
        int    len1 = tal1.length (); 
        int    len2 = tal2.length (); 
        int    len  = resultat.length (); 
        int    maxLen = Math.max (Math.max (len1, len2), len); 
        tal1 = sattLen (tal1, maxLen - len1); tal2 = sattLen (tal2, maxLen - len2); 
        resultat = sattLen (resultat, maxLen - len); 
 
        // visa heltalen och resultatet 
        out.println ("  " + tal1); 
        out.println ("" + operator + " " + tal2); 
        for (int i = 0; i < maxLen + 2; i++) 
            out.print ("-"); 
        out.println (); 
        out.println ("  " + resultat + "\n"); 
 } 
 
    // sattLen lägger till ett angivet antal mellanslag i början av en given sträng 
 public static String sattLen (String s, int antal) 
 { 
        StringBuilder    sb = new StringBuilder (s); 
        for (int i = 0; i < antal; i++) 
            sb.insert (0, " "); 
 
        return sb.toString (); 
 } 
}