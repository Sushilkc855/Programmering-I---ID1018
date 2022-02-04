import java.io.*; 
class Punkt {
    private int    x; 
    private int    y; 
    private String    punktName; 
    
    // Den initierrar ett objekts olika komponenter när objektet skapas. 
    public Punkt (String punktName, int x, int y){
        this.x = x; 
        this.y = y; 
        this.punktName = punktName; 
        }
    
    public String getName(){
        return this.punktName; 
        }
    
    public int getX(){
        return this.x; 
        }
    
    public int getY(){
        return this.y; 
        }
    
        // Beräknar avstånd mellan två punkter genom att använda pythagoras. 
    public double    distance (Punkt p){
        return Math.sqrt ((p.x - this.x) * (p.x - this.x) + (p.y- this.y) * (p.y- this.y));
        }
    
    public boolean   equals (Punkt p){
        return p.x == this.x && p.y == this.y;
        }
    
    public void setX(int x){
        this.x = x; 
        }
    
    public void setY(int y){
        this.y = y; 
        }
    
    // Koperings konstruktor 
    public Punkt (Punkt p){
        this.x = p.x; 
        this.y = p.y; 
        this.punktName = p.punktName;
        }
    
         //intansmethoder
    public String toString (){
        return "(" + this.punktName+ " , " + this.x + " , " + this.y + ")"; 
        }
    }

class PunktTest 
{ 
    public static void main (String[] args) 
    { 
        PrintWriter    out = new PrintWriter (System.out, true); 
        // testa en konstruktor och en transformator 
        Punkt    p1 = new Punkt ("A", 1, 2 ); 
        Punkt    p2 = new Punkt ("B", 4, 6); 
        out.println (p1 + "    " + p2); 
     
        // testa inspektorer 
        String    n = p1.getName (); 
        int    x = p1.getX (); 
        int    y = p1.getY (); 
        out.println (n + " " + x + " " + y); 
     
        // testa en kombinator och en komparator 
        double    d = p1.distance (p2); 
        out.println (d);
        
        boolean    b = p1.equals (p2); 
        out.println (b); 
     
        // testa mutatorer 
        p2.setX (1); 
        p2.setY (2); 
        out.println (p2); 
     
        //testa en konstruktor till 
        Punkt    p = new Punkt (p1); 
        out.println (p); 
     } 
} 
    
   