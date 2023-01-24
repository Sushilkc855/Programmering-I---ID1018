class DenKortasteVagen
{
 // mellanstationer returnerar en vektor med de mellanstationer som finns på den kortaste
 // vägen. Ordningsnummer av den första mellanstationen finns på index 1, och ordningsnummer
 // av den andra mellanstationen på index 2 i vektorn.
 public static int[] mellanstationer (double[] a, double[][] b, double[] c)
 {
    int[]    z = new int [3];
    double    dmin = a[1] + b [1] [1] + c[1]; 

    for (int i = 1; i < a.length; i++ ){
        for (int j = 1; j < c.length; j++ ){
            if ( (a[i]+ b[i] [j] + c [j]) < dmin)  {
                dmin = a[i]+ b[i] [j] + c [j]; 
                z[1] = i;
                z[2] = j; 
            }
        }
    }
    return z; 
 }


 // langd returnerar längden av den kortaste vägen.
 public static double langd (double[] a, double[][] b, double[] c)
 {
    int[]    shortPath = mellanstationer(a, b, c); 
    double shortestPath = a[shortPath[1]] + b [shortPath[1]] [shortPath[2]] + c [shortPath[2]]; 
    return shortestPath; 
 }
}
