import java.util.*;

public class Practice {
    public static void main(String[] args) {

         int outerCounter = 1;
        int[] innerArray = {1,2,3,4,5,6,7,8,9,10,11,12};

        while(outerCounter<7){  // do this 7 times
            System.out.println(); //print 7 times
            for(int number : innerArray){ //for all the numbers in the array
                System.out.print(number * outerCounter + " ");
            }
            outerCounter++;
        }


    }//end of main
}//end of class
