import java.awt.*;
import java.util.Arrays;

import javax.sound.sampled.SourceDataLine;
class Simple {  
public static void main(String args[]) {  
    System.out.println("Hello Java"); /* We are accessing the System class and inside the calss 
     we have members. We access the out member and we access the method println. */
     
     
/***********  ARRAYS ***********/
     /*  int[] numbers = new int[5];
       numbers[0] = 1;
       numbers[1] = 2; 
        
       System.out.println(Arrays.toString(numbers)); */
        /*
       int[] numbers = {2, 3, 4, 1, 4};
       Arrays.sort(numbers);
       System.out.println(Arrays.toString(numbers));
       */


/***********       MULTI-DIMENSIONAL ARRAYS ****************/

       int [] [] numbers = new int[4] [4]; 
      numbers [2] [2] = 1;
     // int [] [] numbers = { {1, 2, 3}, {4, 5, 6} }; 
       System.out.println(Arrays.deepToString(numbers));

    }  
}  