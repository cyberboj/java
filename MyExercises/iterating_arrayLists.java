//this program gives total of scores and finds average

import java.util.ArrayList;
/*
quiz 1 = 80
quiz 2 = 83
quiz 3 = 88
quiz 4 = 90
quiz 5 = 97

steps:
- find total
- find quiz average
 */
public class Practice {

    public Practice() {
    }//end of constructor

    public static void main(String[] args){

        ArrayList<Integer> quizScores = new ArrayList<Integer> ();//creating array list of quiz scores
        int quiz1 = 80;
        int quiz2 = 83;
        int quiz3 = 88;
        int quiz4 = 90;
        int quiz5 = 97;

        double total = 0; //declaring total variable that we'd use in our loop

        quizScores.add(quiz1);  //adding quiz scores to our list
        quizScores.add(quiz2);
        quizScores.add(quiz3);
        quizScores.add(quiz4);
        quizScores.add(quiz5);

        for (int i = 0; i < quizScores.size(); i++){ //from beginning to end of our array list size...
            total += quizScores.get(i); //total is addition of all i's which is all elements in our array list
        }//end of loop

        System.out.println("Your quiz average is :" + total/5 + " %");//print your quiz average is + total/5 that finds the actual average

    }//end of main method
}//end of class