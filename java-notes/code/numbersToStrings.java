//this program converts numbers to strings with a method "getAges"

import java.util.Arrays;

public class Practice {

public int[] getAges(){
int ages[] = {7, 16, 13, 25};
return ages;

}//end of method
public static void main(String[] args){


Practice please = new Practice();
String list = Arrays.toString(please.getAges());
System.out.println(list);

/* OR

Practice please = new Practice();
int[] ages = please.getAges(); //reassigning variables
System.out.println(Arrays.toString(ages));

*/
System.out.println(ages[3]); //printing element from index 3 




}//end of main method
}//end of class


