/* this program finds the highest salary

info systems sec manager = 149k
mobile app dev = 135,750
network/cloud architect = 146k
network/cloud engineer = 115,250
data center technician = 32,760
it support = 45k

*/
import java.util.ArrayList;
public class Practice {




    public static void main(String[] args) {
        ArrayList<Integer> itSalaries = new ArrayList<Integer>();
        itSalaries.add(149000);
        itSalaries.add(135750);
        itSalaries.add(146000);
        itSalaries.add(115250);
        itSalaries.add(32760);
        itSalaries.add(45000);

        int highestSalary = 0;

        for (int salary : itSalaries){
            if (salary > highestSalary){
                highestSalary = salary;
                System.out.println("the highest salary is $" + highestSalary);
            }
        }//end of for loop
        
    }//end of main
        }//end of class