package SANDIP;        // calling the user defined method in main method by creating the object//

public class CAR {       // create the class////class name will be first capital rest of lower cases
    public void cricket(){  //create cricket() method
        System.out.println(" cricket is nice game");
    }
    public void football(){   // create football()method
        System.out.println(" football i dont like ");
    }
    //inside the main method, call the methods on the nice object
    public static void main (String[] args){   //create main method
        CAR nice=new CAR();  //CLASSNAME OBJECT= NEW CLASS NAME// //CREATE NEW OBJECT//
        nice. cricket ();   // call the cricket() method ////object will be small letters
        nice.football();    // call the football() method //
    }
}
