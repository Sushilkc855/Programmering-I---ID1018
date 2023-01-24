import javax.swing.text.AbstractDocument.LeafElement;

// min returnerar det minsta elementet i en sekventiell samling. 
// Om samlingen är tom, kastas ett undantag av typen IllegalArgumentException. 
class min1{
    public static void main(String[] args) {
        int[] test1 = {4,5,12,8,7,6,14,3,2,9,1,17,13,21,11,10};
        int[] test2 = {11,3,7,18,24,12,36,2,6,8,16,15,9,4,10,27,1,28,13};

        System.out.println(min(test1));
        System.out.println();
        System.out.println(min(test2));
    }


    public static int min (int[] element) throws IllegalArgumentException 
    { 
        if (element.length == 0) 
            throw new IllegalArgumentException ("tom samling"); 
     
        // hör ihop med spårutskriften 2: 
        int    antalVarv = 1; 
     
        int[]    sekvens = element; 
        int      antaletPar = sekvens.length / 2; 
        int      antaletOparadeElement = sekvens.length % 2; 
        int      antaletTankbaraElement = antaletPar + antaletOparadeElement; 
        int[]    delsekvens = new int[antaletTankbaraElement]; 
        int      i = 0; 
        int      j = 0; 

        while (antaletPar > 0) //while (sekvens.length > 1) 
        { 
            // skilj ur en delsekvens med de tänkbara elementen 
            i = 0; 
            j = 0; 
            while (j < antaletPar) 
            { 
                delsekvens[j++] = (sekvens[i] < sekvens[i + 1])? sekvens[i] : sekvens[i + 1]; 
                i += 2; 
                //System.out.println(delsekvens[j-1]);
            } 
            if (antaletOparadeElement == 1) 
                delsekvens[j] = sekvens[i]; // sekvens[sekvens.length - 1]; 
     
            // utgå nu ifrån delsekvensen 
            sekvens = delsekvens; 
            antaletPar = antaletTankbaraElement / 2; 
            antaletOparadeElement = antaletTankbaraElement % 2; 
            antaletTankbaraElement = antaletPar + antaletOparadeElement; 
            //delsekvens = new int[antaletTankbaraElement]; // Glömde lägga till den 
            // spårutskrift 1 – för att följa sekvensen 
            System.out.println (java.util.Arrays.toString (sekvens)); 
     
            // spårutskrift 2 - för att avsluta loopen i förväg 
            // (för att kunna se vad som händer i början) 
            if (antalVarv++ == 10) 
                System.exit (0);
        } 
     
        // sekvens[0] är det enda återstående tänkbara elementet 
        // - det är det minsta elementet 
        return sekvens[0]; 
    } 


    public static int minv2 (int[] element) throws IllegalArgumentException 
    { 
        if (element.length == 0) 
            throw new IllegalArgumentException ("tom samling"); 
     
        // hör ihop med spårutskriften 2: 
       int min = element[0]; 
     
        for (int i = 1; i < element.length; i++){
            if (min > element[i]){
                min = element[i]; 
            }
        }
        
        return min; 
    }
}




