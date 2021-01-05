//print a 3x3 identity matrix in a matrix format

import java.util.*;

public class Practice {

    public static void main(String[] args){
        int[][] identityMatrix = {
                {1,0,0},
                {0,1,0},
                {0,0,1}
        };

        for (int outIndex = 0; outIndex < identityMatrix.length; outIndex++){
            for (int inIndex = 0; inIndex < identityMatrix[0].length; inIndex++) {
                System.out.print(identityMatrix[outIndex][inIndex] + "\t");
            }//for 1
            System.out.println();
        }//for 2

    }//end of main method
}//end of class