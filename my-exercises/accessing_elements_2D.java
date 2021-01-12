Accessing elements in a 2D array

import java.util.*;

public class Practice {

    public Practice(){

    }//end of constructor



    public static void main(String[] args) {
//        char[][] ticTacToe = {{'X','O','O'},{'O','X',' '},{'X',' ','X'}};
//        System.out.println(ticTacToe);


        String[][] candy = {{"tom","tom"},{"pin","pop"},{"chewing","gum"}};
        System.out.println(candy[1][0] + candy[1][1]);//prints pinpop

        //what we're doing here is that we're taking the value in candy[1][1] which is pop and then assigning it to a String value, blow
        String blow = candy[1][1];
        System.out.println(blow); //prints pop

    }//end of main
}//end of class

