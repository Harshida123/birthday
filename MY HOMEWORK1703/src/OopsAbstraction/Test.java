package OopsAbstraction;

public class Test {   //CREATE CLASS
    public static void main (String[] args){ // DECLARE MAIN METHOD
        Puppy p1 = new Food(); //CLASS OBJECT REFER TO ABSTRACT METHOD VARIABLE
        p1.colour(); //BY ABSTRACT METHOD VARIABLE CALLING ABSTRACT METHODS//
        p1.dog();

        Food f1 =new Food(); // CREATE A OBJECT IN CHILD CLASS
        f1.temple();
        f1.colour();
        f1.dog();

        // CALLING THE CHILD CLASS METHOD BY USING CHILD CLASS OBJECT//
        }
}
