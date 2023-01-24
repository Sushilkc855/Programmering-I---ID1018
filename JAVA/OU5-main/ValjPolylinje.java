import java.util.Arrays;
import java.util.Random;

class ValjPolylinje 
{ 
    public static final Random    rand = new Random (); 
    public static final int    ANTAL_POLYLINJER = 10;
    Polylinje[]    polylinjer;
    public static void main (String[] args) 
    { 
        // skapa ett antal slumpmässiga polylinjer 
        Polylinje[]    polylinjer = new Polylinje[ANTAL_POLYLINJER]; 
        for (int i = 0; i < ANTAL_POLYLINJER; i++) {
            polylinjer[i] = slumpPolylinje (); 
        }
        // visa polylinjerna 
        System.out.println(polylinjer);

        // bestäm den kortaste av de polylinjer som är gula 
        int    k = 0; 
        double    kortaste = 0; 
        boolean    colorYello = true; 
         for (int i =1; i < polylinjer.length; i++){
            if (polylinjer[i].getFarg().equals("yello")){     
                    if (!colorYello && kortaste > polylinjer[i].langd())
                    {
                        kortaste = polylinjer[i].langd();
                        k = i; 
                    }
                    else if (colorYello)
                    {
                        kortaste = polylinjer[i].langd(); 
                        k = i; 
                        colorYello = false; 
                    }
                }
            }
            
        
        // visa den valda polylinjen 
        
        System.out.println(kortaste + ", " + polylinjer[k]);
        

    } 
    

    public String toString(){
        StringBuilder    sb = new StringBuilder("["); 
        for (int i= 0; i < ANTAL_POLYLINJER; i++)
        {
            sb.append (polylinjer[i]); 
        }
        return sb.toString();
    }

    public static String RandomFarg()
	{
		String[] farger = {"blue", "red", "yello"};
		int i = (new Random().nextInt(3));
		String farg = farger[i];
		return farg;
	}

    // slumpPunkt returnerar en punkt med ett slumpmässigt namn, som är en stor bokstav i 
    // det engelska alfabetet, och slumpmässiga koordinater. 
    public static Punkt slumpPunkt () 
    { 
        String    n = "" + (char) (65 + rand.nextInt (26)); 
        int    x = rand.nextInt (11); 
        int    y = rand.nextInt (11); 
 
        return new Punkt (n, x, y); 
    } 
 
    // slumpPolylinje returnerar en slumpmässig polylinje, vars färg är antingen blå, eller röd 
    // eller gul. Namn på polylinjens hörn är stora bokstäver i det engelska alfabetet. Två hörn 
    // kan inte ha samma namn. 
    public static Polylinje slumpPolylinje () 
    { 
        // skapa en tom polylinje, och lägg till hörn till den 
        Polylinje    polylinje = new Polylinje (); 
        int    antalHorn = 2 + rand.nextInt (7); 
        int    antalValdaHorn = 0; 
        boolean[]    valdaNamn = new boolean[26];
        Arrays.fill(valdaNamn, Boolean.FALSE); 
        // ett och samma namn kan inte förekomma flera gånger 
        Punkt    valdPunkt = null; 
        char    valtChar = 0; 
        while (antalValdaHorn < antalHorn) 
        { 
            valdPunkt = slumpPunkt(); 
            valtChar = valdPunkt.getName().charAt(0); 
            if (valdaNamn[(int)(valtChar-65)] == false)
            {
                valdaNamn[(int)(valtChar-65)] = true; 
                polylinje.laggTill(new Punkt (slumpPunkt()));
                antalValdaHorn++;
            }
            
        } 
            polylinje.setFarg(RandomFarg());
            System.out.println(polylinje);
        return polylinje; 
        // sätt färg 


    } 
} 







class Polylinje 
{ 
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
        double langd = 0;
        for(int i = 0; i < this.horn.length-1; i++)
        {
            int currentX = this.horn[i].getX();
            int currentY = this.horn[i].getY();
            int nextX = this.horn[i+1].getX();
            int nextY = this.horn[i+1].getY();
            langd += Math.sqrt(Math.pow((nextX-currentX), 2) + Math.pow((nextY-currentY), 2));
        }
        return langd;
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

    public class PolylinjeIterator {

        public void gaFram() {
        }

        public boolean finnsHorn() {
            return false;
        }

        public char[] horn() {
            return null;
        }
    } 
} 