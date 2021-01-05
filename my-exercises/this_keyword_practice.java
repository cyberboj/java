import java.util.*;

public class Practice {

    public String name;

    public Practice (String inputName){
        this.name = inputName;
    }

    public void sayName(String name){
        System.out.println("My name is " + name);
    }


    public static void main(String[] args){

        Practice hero = new Practice("Clark Kent");
        hero.sayName("Superman");

    }//end of main
}//end of class