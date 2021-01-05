
/* this program breaks after finding my school
UofT
york
harvard
oxford
brock
lakehead
unilag
babcock

 */
import java.util.*;
public class Practice {
    public static void main(String[] args) {

        ArrayList<String> schools = new ArrayList<String>();
        schools.add("UofT");
        schools.add("York");
        schools.add("Harvard");
        schools.add("Oxford");
        schools.add("Brock");
        schools.add("Lakehead");
        schools.add("Unilag");
        schools.add("Babcock");

        for (String school : schools) {
            if (school.equals(schools.get(4))) { //if Brock
//                schools.remove(schools.get(4));
              //  System.out.println(schools);
                break;
            }
           System.out.println(schools);
        }




}//end of main
}//end of class

