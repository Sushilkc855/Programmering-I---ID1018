public class TriangelFormler {
    public static double triangelArea (Double bas, Double height) {
        return (bas * height) / 2; 
    }

    public static double triangelOmkrets (double sid1, double sid2, double sid3) {
        return (sid1+ sid2+ sid3); 
    }

    // cosinussatsen tar emot två sidor i en triangel och vinkeln(i radianer) mellan dessa sidor.
    // Metoden returnerar längden på den tredje sida. 
    public static double cosinussatsen (double b, double c, double alfa) {
        double    a = Math.sqrt ( b * b + c * c - 2 * b * c * Math.cos(alfa));
        return a;
    }

    // Areasatsen tar emot två sidor i en triangel och vinkeln(i radianer) mellan dessa sidor.
    public static double areasatsen (double b, double c, double alfa) {
        double    a = (c * b  * Math.sin(alfa)) / 2;
        return a;
    }

    public static double sinussatsen (double c, double a, double alfa) {
        double    alfa2 = (Math.sin(alfa)/ a) * c;
        return alfa2; 
    }

    // bisektris tar emot två sidor i en triangel och vinkeln(i radianer) mellan dessa sidor.
    // Metoden returnerar längden av den motsvarande bisektrisen -den som delar den givnavinkeln
    // i två lika delar.
    public static double bisektris (double b, double c, double alfa) {
        double    p = 2 * b * c * Math.cos (alfa / 2);
        double    bis = p / (b + c);
        return bis;
    }

    // Metoden returnerar radie av den cirkel som finns inuti triangel. 
    public static double inskrivenCirkelRadie (double a, double b, double c) {
        double    s = 0.5 * ( a + b + c); 
        double    r = Math.sqrt( ( ( s - a ) * ( s - b ) * ( s - c ) ) / s ); 
        return    r; 
    }

    // Metoden returnerar radie av den cirkel som finns utanför triangel.
    public static double utskrivenCirkelRadie (double a, double b, double c) {
        double    s = 0.5 * ( a + b + c); 
        double    r = (a * b * c) / ( 4 * Math.sqrt( s * (s - a ) * ( s - b) * (s - c) ) ); 
        return    r; 
    }
}