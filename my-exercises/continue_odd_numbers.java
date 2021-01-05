//this program skips odd numbers

 
 import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        for (int i = 0; i <= 20; i++){
            if( i%2 != 0){
                continue;
            }
            System.out.println(i);
        }
    }//end of main
}// end of class