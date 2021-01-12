/* this program gives you your bill. practicing traversing...going over each item in a list and doing something to them

jrice = 20
suya = 15
water = 3
donut = 6
osmows = 32
milkshake = 8

 */
import java.util.ArrayList;
public class Practice {
    public static void main(String[] args){
        ArrayList<Integer> cart = new ArrayList<Integer>();
        cart.add(20);
        cart.add(15);
        cart.add(3);
        cart.add(6);
        cart.add(32);
        cart.add(8);

        int bill = 0;

        for (int i = 0; i < cart.size(); i++){

            bill += cart.get(i);
        }
        System.out.println("your bill is $" + bill);


    }//end of main
}//end of class-