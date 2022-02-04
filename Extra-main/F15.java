// att arreyer är oberoende av vararandra. 

public class F15 { // objekt med array. Kopiera referensen. 
    public static void main(String[] args) {
        int []    a0=new int [0]; 
        Set    s0= new Set(a0); 
        System.out.println(s0);

        int[]    a = {1, 2, 3, 4, 5}; 
        Set    s = new Set(a);
        System.out.println(s);

       // Set    c = new Set(s); 
      //  System.out.println(c);
    }
}

class Set{
    private int[]    e;

    public Set ()
    {
        this.e = new int [0]; 
    }

    public Set (int[] e)
    {
        this.e = new int[e.length];
        for ( int i = 0; i<this.e.length; i++)
        this.e[i] = e[i]; 
        //this.e = e; 
    }

  /*  Public Set (Set s)
    {
        this.e = new int [s.e.length]; 
        for (int i = 0; i < this.e.length; i++)
        this.e[i] = s.e[i]; 
    }
*/
}