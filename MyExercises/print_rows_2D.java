//this program prints the first row

import java.util.*;
public class Practice {
    public static void main(String[] args) {
        int matrix[][] = {
                {52,74,73,90},
                {80,88,92,86},
                {0,0,85,88},
                {91,93,90,100}
        };

        int student1 = 0;

        for (int a = 0; a < matrix.length; a++) {

            student1 = 0;

            for (int b = 0; b < matrix[a].length; b++) {
                
                student1 = matrix[0][a];  //

                System.out.println("student 1's results for quiz " + (a+1) +" are: " + student1);
                break;
            }//row

        }//column

    }//end of main
}//end of class