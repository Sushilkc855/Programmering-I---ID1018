// Node lista
public class F16 {
    public static void main(String[] args) {
        List     list0 = new List(); 
        System.out.println(list0);
        int [] a = {1, 2, 3, 4}; 
        List    list = new List(a); 
        System.out.println(list);

        System.out.println(list0.size());
        System.out.println(list.size());
        System.out.println(list.get(2));
        list.set(2, 33);
        System.out.println(list);

        list.add(5);
        System.out.println(list);

        list.insert(0, 100);
        System.out.println(list);
        list.insert(2, 30);
        System.out.println(list);
    }
}



class List
{
    private static class Node 
    {
        public    int    value; 
        public Node    next; 

        public Node (int value)
        {
            this.value = value; 
            this.next = null; 
        }
    }

    private Node    first; 
    public List ()
    {
        first = null; 
    }

    public List (int[] a)
    {
        if (a.length == 0)
        first = null; 
        else 
        {
            Node    n=new Node (a[0]);
            first = n;
            for (int i = 1; i < a.length; i++)
            {
                n.next = new Node (a[i]);
                n = n.next; // Förjer listan 
            } 
        }
    }

    public String toString ()
    {
        String    s = "{";

        if (first != null)
        {
            Node    n= first; 
            while (n.next != null)
            {
                s+= n.value + ", ";
                n= n.next; 
            }
            s+= n.value; 
        }

        s += "}"; 
        return s; 
    }
    
    public int size ()
    {
        int    noe = 0;
        Node    n = first; 
        while (n != null) {
            noe++; 
            n = n.next; 
        }
        return noe; 
    }

    public int get (int index)
    {
        Node    n = first;
        for (int i = 0; i< index; i++)
            n = n.next; 
            
        return n.value;  
    }

    public void set (int index, int value)
    {
        Node    n = first;
        for (int i = 0; i< index; i++)
            n = n.next; 
            
        n.value = value; 
    }
    
    public void add (int value)
    {
        Node    node = new Node(value); 
        if (first == null)
            first = node; 
        else
        {
            Node    n = first; 
            while (n.next != null)
                n = n.next; 
            n.next = node; 
        }
    }

    public void insert (int index, int value)
    {
        if (index < 0 || index >= this.size())
            throw new IndexOutOfBoundsException("worng number: "+ index);


        Node     node = new Node(value); 
        if (index == 0)
        {
            node.next = first; 
            first = node; 
        }
        else
        {
            Node n = first; 
            for (int i = 0; i < index -1; i++)
                n = n.next; 
            node.next = n.next;
            n.next = node;  

        }
    }

    

}

