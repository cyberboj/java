//practicing row major order, this program accesses the matrix data row by row and prints the sum
import java.util.*;
public class Practice {
    public static void main(String[] args) {
        int[][] matrix = {
                {0,1,1},
                {0,1,2},
                {1,3,0}
        };

        int rowSum = 0;
        for(int a = 0; a < matrix.length; a++) {

            rowSum = 0;
            for(int b = 0; b < matrix[a].length; b++) {

                rowSum += matrix[a][b];
            }//inner loop
            System.out.println("row: " + a + ", sum: " + rowSum);
        }//outer loop

    }//end of main
}//end of class