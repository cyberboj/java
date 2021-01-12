
//ENDING A TRAVERSAL WITH BOOLEAN METHOD

public class Practice {
    public static boolean findMySchool (String[] mySchool){
        for (int i = 0; i < mySchool.length; i++){
            System.out.println(mySchool[i]);
            if (mySchool[i] == "Brock" ){
              //  break;
                return true;
            }
        }
        return false;
    }//end of method


    public static void main(String[] args) {
        String[] schools = {"UofT","YorkU","Harvard","Oxford","Brock","Lakehead","Unilag","Babcock"};
        System.out.println(findMySchool(schools));



    }//end of main
}// end of class