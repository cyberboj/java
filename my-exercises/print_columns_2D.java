/* practicing column major order, this program accesses the matrix data column by column and prints the results of quiz 1 for each student
student 1 = matrix[0] = {52,74,73,90}
student 2 = matrix[1] = {80,88,92,86}
student 3 = matrix[2] = {0,0,85,88}
student 4 = matrix[3] = {91.93,90,100}

quiz 1 = matrix[a][0];
 */
import java.util.*;
public class Practice {
    public static void main(String[] args) {
        int matrix[][] = {
                {52,74,73,90},
                {80,88,92,86},
                {0,0,85,88},
                {91,93,90,100}
        };

        int quiz1 = 0;

        for (int a = 0; a < matrix[0].length; a++) {  //termination condition is length of column

            quiz1 = 0;

            for (int b = 0; b < matrix.length; b++) { //termination condition is length of row

                quiz1 = matrix[a][0];                 //quiz 1 is the first element in every row

            }//row
            System.out.println("student " + (a+1) + "'s results for first quiz: " + quiz1); //a+1 so that it prints student 1 instead of student 0
        }//column

    }//end of main
}//end of class
