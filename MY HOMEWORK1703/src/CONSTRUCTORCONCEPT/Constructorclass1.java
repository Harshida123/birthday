package CONSTRUCTORCONCEPT;

public class Constructorclass1 {   //CREATE CLASS


    public Constructorclass1(){   //CREATE   CONSTRUCTOR DEFAULT METHOD WITH CLASSNAME
        System.out.println("default constructor"); //PRINT OUT
    }
        public static void main(String[] args){   // DECLARE MAIN METHOD OUTSIDE THE CONSTRUCTOR MEHTOD
        Constructorclass1 c1 = new Constructorclass1();//CREATE A OBJECT IN MAIN METHOD FOR CALLING THE CONSTRUCTOR METHOD
        }
        //IMP: CONSTRUCTOR NEVER RETURN VALUE SO WE CAN NOT WRITE RETURN STATEMENT//
        // CONSTRUCTOR METHOD NAME WILL BE ALWAYS A CLASSNAME//
       // CONSTRUCTORS ARE INDEPENDENT SO YOU CAN NOT CREATE A CONSTRUCTOR METHOD INDIE THE MAIN METHOD//
      //WHEN CLASS VARIABLE NAME AND LOCAL VARIABLE NAME IS SAME THEN WE USE KEYWORD "THIS."
      // TO DEFINED IN JAVA
}
