import java.util.*;

import javax.print.event.PrintEvent;
public class f12 
{
    public static void main(String[] args) {
        char[]     a = {'a', 'b', 'c', 'd', 'e'}; 
        System.out.println(a);
        //fill(a, 1, 4, 'e');

        try
        {
            fill(a, 4, 5, 'e');
            System.out.println(Arrays.toString(a));
        }

       /* catch (Exception e) // delar till alla klasser.
        {

            System.out.println("problem");
        }*/
        catch (ArrayIndexOutOfBoundsException e) //ArrayIndexOutOfBoundsException | IllegalArgumentException e
        {
            System.out.println("problems");
        }
        
        catch (IllegalArgumentException e)
        {
            //System.out.println("Problem Problem");
          //  System.out.println(e.getMessage());
            System.out.println(e);
        
        }

        finally 
        {
            System.out.println("lol");
        }

        System.out.println("end");
    }

    public static void fill (char[] a, int fromIndex, int toIndex, char c)
             throws ArrayIndexOutOfBoundsException, 
            IllegalArgumentException 
    {
        if ( fromIndex < 0 || toIndex > a.length)
        throw new ArrayIndexOutOfBoundsException ("wrong index");
/*
{
ArrayIndexOutOfBoundsException e = 
            new ArrayIndexOutOfBoundsException ("Wrong Index");
throw e;
}*/
        if ( fromIndex > toIndex)
        throw new IllegalArgumentException ("wrong index order");

        for (int i = fromIndex; i < toIndex; i++)
        a[i] = c;
}

}