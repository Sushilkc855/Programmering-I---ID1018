import java.io.*;
import static java.lang.System.*;
public class F13 {
    public static void main (String[] args)
    {
        String    fil = "fil1.dat";  // Skapa filer

        try
        {
            // FileOutputStream    fos = new FileOutputStream (fil);
            // BufferedOutputStream    bos = new BufferedOutputStream (fos, 512);
            DataOutputStream    dos = new DataOutputStream (new FileOutputStream (fil));

            int    n = 1290;
            dos.writeInt (n);
            dos.writeChars("abcd|");

            dos.close ();
            out.println ("1234");

            //FileInputStream   fis = new FileInputStream (fil);
            //BufferedInputStream    bis = new BufferedInputStream (fis, 512);
            DataInputStream    dis = new DataInputStream (new FileInputStream (fil));

            int    p = dis.readInt ();
            out.println (p);
            StringBuilder    sb = new StringBuilder();
            char    c = dis.readChar();
            while (c != '|')
            {
                sb.append (c);
                c = dis.readChar ();
            }
            out.print(sb);

            dis.close();
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }
    }


}