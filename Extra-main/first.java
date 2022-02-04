class Demo // en class med namn Demo. Ofta börjas med ed stor bokstav. Funktioner inuti classer kallas för methoder.
{
    public static void main (String[] args) //main method. För att kunna exekvera koden måste main method finnsas.
    {
        System.out.println("Hello"); 
        /* Gå till class Ststem och använd method printin.
        Detta är en standarad java biblotek. Denna rad kallas för en sats och avslutas med semikolon. 
        println betyder printa och gå till ny rad eller  man kan använda \n: new line. \t = tab. 
        Använd bara print om man vill bara skriva ut. 
        För att använda citattecken så kan man skriva \" och samma med många olika speciella tecken.*/

        int    n = 9;  /* Datatyp    Variabelnamn tilldelningstecken Tilldelningsvärde. Kopiering. */
        System.out.println("n= "+ n); /*concatenate. Combine text strings */

        int    m = n * n;
        System.out.println("m= " + m);

        n = m * 25;
        System.out.println (n);

        //final int   MAX_GRADE = 10;
        System.out.println (222222222222222L); /*1 bite: 1 plasts. 1 Byte: 8 bitar kan representera tal upptil 2^8; men print 
        är integer standard. Så man måste skriva L i slutet för att representera tal som är större än integer. Byte, int, long*/

        /*Standard men flytal är att det skapas som double från bröjan men om man vill lägra det tal som flot kan man lägga till 
        F i slutet av ta. */

        System.out.println (Float.MAX_VALUE);

        double    d = 1.6E3; // Den har lagras som två heltal. Float kan representera större tal än long. 
        System.out.println (d); 
        // Char är för tecken. 
        char    b = 97; 
        System.out.println(b); // Tvingar ett double att lagra som float. Med  float t = (float) 1.343432; 

        System.out.println(Math.pow (2, 16));

        long    v = 113413413431413L;
        float   t = v; 
        System.out.println (t);
    }
}