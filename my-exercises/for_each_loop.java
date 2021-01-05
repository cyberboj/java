
//this program finds the priciest item in a list


import java.util.*;

public class Practice {

        public static void main (String[]args){

            ArrayList<Double> expenses = new ArrayList<Double>();
            expenses.add(74.46);
            expenses.add(63.99);
            expenses.add(10.57);
            expenses.add(81.37);

            double mostExpensive = 0;

            // Iterate over expenses
            for (double whateverYouWannaCallIt: expenses){
                if(whateverYouWannaCallIt > mostExpensive) {
                    mostExpensive = whateverYouWannaCallIt;
                }//end of if
            }//end of for

            System.out.println(mostExpensive);




    }//end of main method
}//end of class


     //   System.out.println();