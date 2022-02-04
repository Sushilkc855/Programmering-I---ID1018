import java.io.*;
import java.net.http.HttpResponse;
import java.security.PKCS12Attribute;

class PolylinjeTest {
     Punkt []    horn; 
    public static void main(String[] args) {
        PrintWriter    out = new PrintWriter (System.out, true);
        Polylinje    p1 = new Polylinje(); 
        Punkt    p = new Punkt("A", 3, 43);
        p1.laggTill(p);
        p1.laggTill(new Punkt("C", 5, 3));
        out.println(p1 + "\n");

        p1.laggTillFramfor(new Punkt("B", 4, 5), "C");
        p1.laggTillFramfor(new Punkt("AB", 4, 5), "B");
        out.println(p1 + "\n");

        p1.taBort("AB");
        out.println(p1 + "\n");

        p1.setBredd(5);
        p1.setFarg("blue");
        out.println(p1.getFarg() + ", " + p1.getBredd());
/*
        Polylinje    p2 = new Polylinje(p1);
        p1.Polylinje(p2); 
        p2.Polylinje(p1); */
       
       // Polylinje    pp = new Polylinje(p1.getHorn());  
        Polylinje.PolylinjeIterator   polyIter = p1.new PolylinjeIterator(); 
        while (polyIter.finnsHorn()) {
            System.out.println(polyIter.horn());
            polyIter.gaFram();
        }

       

        }
}

//package OU5; 

class Polylinje 
{ 

    public class PolylinjeIterator 
    { 
        private int    aktuell = -1; 
 
        public PolylinjeIterator () 
        { 
            if (Polylinje.this.horn.length > 0) 
                aktuell = 0; 
        } 
 
        public boolean finnsHorn () 
        { 
            return aktuell != -1; 
        } 
 
        public Punkt horn () throws java.util.NoSuchElementException 
        { 
            if (!this.finnsHorn ()) 
                throw new java.util.NoSuchElementException ( 
                "slut av iterationen"); 
                Punkt    horn = Polylinje.this.horn[aktuell]; 
 
            return horn; 
        } 
                              
        public void gaFram () 
            { 
                if (aktuell >= 0  && aktuell < Polylinje.this.horn.length - 1) 
                    aktuell++; 
                else 
                    aktuell = -1; 
            } 
    }




    private Punkt[]    horn; //Skapas en array av typen Punkt och horn är en referens inte ett objekt. 
    private String     farg = "svart"; 
    private int        bredd = 1; 
 
    public Polylinje () 
    { 
        this.horn = new Punkt[0];  
        //Skapar ett array med objekter av typen Punkt, 
        //och låt referensen med index 0 referera till objekt som finns på index 0.
    } 
 
    public Polylinje (Punkt[] horn) 
    { 
        this.horn = new Punkt[horn.length]; 
        for (int i = 0; i < horn.length; i++) 
            this.horn[i] = new Punkt (horn[i]); 
    } 
 
    public String toString () {
        StringBuilder    sb = new StringBuilder("[{"); 
        for (int i= 0; i < this.horn.length; i++)
        {
            sb.append ( this.horn[i] ); 
        }
        sb.append("}" + ", " + farg + ", " + bredd + "]"); 
        return sb.toString(); 
    } 
 
    public Punkt[] getHorn () {
        return horn; 
    } 
 
    public String getFarg () {
        return this.farg;
    } 
 
    public int getBredd () {
        return this.bredd;  
    }

    public void setFarg (String farg) {
        this.farg = farg; 
    } 
 
    public void setBredd (int bredd) {
        this.bredd = bredd;
    } 
 
    public double langd () {
        return this.horn.length;
    } 
 
    //Lägger till ett hörn i slutet av vektorn 
    // genom att skapa en vecktor som har ett mer plats än den aktuella vecktr
    // och lgger till punkter samt den nya punkt i sista position. 
    public void laggTill (Punkt horn) 
    { 
        Punkt[]    h = new Punkt[this.horn.length + 1]; 
        int    i = 0; 
        for (i = 0; i < this.horn.length; i++) 
            h[i] = this.horn[i]; 
        h[i] = new Punkt (horn); 
 
        this.horn = h; 
    } 

    // Lägger till ett hörn framför den hörn som har samma namn.
    public void laggTillFramfor (Punkt horn, String hornNamn) {
        Punkt[]    h = new Punkt[this.horn.length + 1]; // längden+1 för den aktuella hörn.
        int pos = 0; 
        for (int i = 0; i < this.horn.length; i++) {
            h[pos] = this.horn[i];
                if (hornNamn == this.horn[i].getName()){ //Kollar om de har samma namn
                     h[pos] = horn; //Lägger den nya hörn
                     h[++pos] = this.horn[i]; // lägger den aktuella hörn på nästa plats
                }  
            pos++; 
        }
        this.horn = h; // 
    }

    // tar bort horn med ett visst hörnNamn. 
    public void taBort (String hornNamn) {
        Punkt[]    h = new Punkt[this.horn.length - 1]; // längden -1 för den aktuella hörn.
        int    pos = 0;
        for (int i = 0; i < this.horn.length; i++) {
            if (this.horn[i].getName() == hornNamn ) {
                i++;   
            }
        h[pos] = this.horn[i];
        pos++; 
        }
        this.horn = h; 
    } 
} 