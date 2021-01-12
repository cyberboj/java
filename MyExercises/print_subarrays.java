

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        char[][] letterBlock = {{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j', 'k', 'l'}};
//        System.out.println(Arrays.toString(letterBlock[0]) + "\n");
//        System.out.println(Arrays.toString(letterBlock[1]) + "\n");
//        System.out.println(Arrays.toString(letterBlock[2]) + "\n");
//        System.out.println(Arrays.toString(letterBlock[3]) + "\n");
        
        //to print the sub-arrays in the array and then leaving a line of space between them hence the "\n"
      
        for(int whatever = 0; whatever < letterBlock.length; whatever++){
            System.out.println(Arrays.toString(letterBlock[whatever]) + "\n");
        }

    }//end of main
}//end of class


/* Algorithm 
				
  System.out.println(arrayName[outer index][inner index AKA index of element in the sub array); */