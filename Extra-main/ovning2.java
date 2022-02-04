/**
 * ovning2
 */
public class ovning2 {
    public static void sort (int[] sequence)
    {
     int e = 0;
     int holePos = 0;
     for (int pos = 1; pos < sequence.length; pos++)
     {
     e = sequence[pos];
     holePos = pos;
     while (holePos > 0 && e < sequence[holePos - 1])
     {
     sequence[holePos] = sequence[holePos - 1];
     holePos--;
     }
     sequence[holePos] = e;
     System.out.println (java.util.Arrays.toString (sequence));
     }
    }
    public static void main(String[] args) {
        int[] sequence = {8, 2, 7, 1, 5, 6, 3, 4};
System.out.println (java.util.Arrays.toString (sequence));
System.out.println ();
sort (sequence);
    }
}
