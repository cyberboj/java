1st Class

import java.util.*;

public class Practice{

    public static void main(String[] args){
//        PhoneNumber mine = new PhoneNumber();
//        mine.setNumber("30");
//        System.out.println(mine.getNumber());
       Me myObj = new Me();
        myObj.setName("boj");
        System.out.println(myObj.getName());

    }//end of main
}//end of class

2nd Class
//save as Me.java

public class Me {
    private String name;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
}
