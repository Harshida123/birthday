package ShrikantsirHomework31032019;

public class Exercise4 {

    int bike=50;       //make variable  final
     void display(){       //create default method
        bike=100;          //assign the value of final variable
     }
     public static void main(String[] args){   //declare main method
         Exercise4 obj = new Exercise4();    //create object
         obj.display();        // calling the method
         System.out.println("speedlimit is important");
     }
}
//java can not run due to using the word of final