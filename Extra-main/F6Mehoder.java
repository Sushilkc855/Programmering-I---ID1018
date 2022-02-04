import java.util.*;
import java.util.function.DoublePredicate;

public class F6Mehoder {
    public static final Double PI =  3.14;
    public static void main(String[] args) {
        Scanner    in = new Scanner (System.in);

        String    s1 = "abcd efgh"; 
        println (s1);
        String    s2 = in.nextLine();
        println (s2);
        
        System.out.println("efter");

        int    m= in.nextInt(); 
        int    n= in.nextInt();

        max(m, n); 
        
        int []    v = {3, 4, 5, 5, 32, 53, 234, 45, 23}; 
        int    n2 = max(v);
        System.out.println(n2);

    }

    public static int max (int n1, int n2)
    {
        return (n1 > n2)? n1 : n2; 
    }

    public static int max (int[] n)
    {
        int m=n[0];
        for (int i = 1; i < n.length; i++)
        if (n[i] > m)
            m = n[i];
        return m; 
    }

    public static Double max (Double n1, Double n2) // mehod overloading. Två methoder med samma namn men olika funtioner.
    {
        return (n1 > n2)? n1 : n2; 
    }


    public static void println (String s)
    {
        System.out.println("[" + s + "]");
    }
}
