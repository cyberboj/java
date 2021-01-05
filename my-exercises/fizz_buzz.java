
/* Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”. */

import java.util.*;

public class Practice {
    public static void main(String[] args) {

        int n = 15;

        for (int i = 0; i <= n; i++) {
           // System.out.println(i);
            if( i%3 == 0) {

                System.out.println(i + " is Fizz");
            }

            else if (i%5 == 0) {
                System.out.println(i + " is Buzz");
            }

            else {
                System.out.println(i);
            }


        }//end of for loop


    }//end of main
}//end of class