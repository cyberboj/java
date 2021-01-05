// this program finds my birth year
import java.util.*;
public class Practice {
    public static void main(String[] args) {

        int dob = 2000;

        for (int i = 1; i <= 3000; i++){
            if ( i == dob) {
                System.out.println("i found it! you were born in year: " + i );
                break;
            }
        }

}//end of main
}//end of class