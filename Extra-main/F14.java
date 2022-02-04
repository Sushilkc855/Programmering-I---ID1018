import java.util.*; // crate new objekt types. 
import static java.lang.System.*;

public class F14 {
    public static void main(String[] args) {
        Punkt    p1 = new Punkt(3.0); 
        //p1.x = 3; 
        //p1.y = 4;
        out.println(p1);

        Punkt    p2 = new Punkt(5.0, 6.0); // innehåller adresser för objekt i klassen Punkt. 
       // p2.x = 5; 
       // p2.y = 6;
        out.println(p2);

        Punkt    p3 =  new Punkt (3.0, 4.0); 
        out.println(p3);

        Punkt    p4 = new Punkt(); 
        out.println(p4);

        // p2.y = 66; 
       // out.println(p2.x + "  " + p2.y);
        //out.println(p3.x + "  " + p3.y);
        //Punkt    p4 =  new Punkt (3.0);
        //out.println(p4.x + " " p4.y);

        double    d2 = p2.distance(); 
        out.println(d2);   
        
        double    d3 = p3.distance(); 
        out.println(d3);  

        double    d = p2.distance(p3); 
        out.println(d);  
    }
}

class Punkt
{
    //intansvariabler
    private double    x; 
    private double    y; 
   // private double    y; 
    // Konstruktorer
  /*  Punkt (Double y){
        this.x = 0; 
        this.y = y; 
    }*/

   public Punkt (Double x){
        this.x = x; 
        this.y = 0; 
    }
    public Punkt (Double x, Double y){
        this.x = x; 
        this.y = y; 
    }

    public Punkt (){
        this.x = 0; 
        this.y = 0; 
    }

    // Koperings konstruktor 
    public Punkt (Punkt p){
        this.x = p.x; 
        this.y = p.y; 
    }

    //intansmethoder
    public String toString (){
        return "(" + this.x + " , " + this.y + ")"; 
    }


    public double    distance ()
    {
        return Math.sqrt (this.x * this.x + this.y * this.y);
    }

    public double    distance (Punkt p)
    {
        return Math.sqrt ((p.x - this.x) * (p.x - this.x) + (p.y- this.y) * (p.y- this.y));
    }
}
