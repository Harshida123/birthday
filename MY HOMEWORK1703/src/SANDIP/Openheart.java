package SANDIP;
//  calling the methods in main method by creatin the object//
public class Openheart {
    public void Body(){  // you can not declare the variable in your own method without object//
                         // method name will be lower cases all of them//
        System.out.println("Heart is main part of the body");




    }
    public void Bigboy(){
        System.out.println("body is nothing without heart");

    }
    public static void main (String[] args){ //create a main method//
        Openheart lefthand=new Openheart();  // create a object and use syntex of object//
        lefthand.Body();                     // call the body method  by use syntex//

        lefthand.Bigboy();                   // call the Bigboy method by use syntex//
        int a=10;                            // declare a variable and assign the vaule in main method//
        int b=20;
        int c=30;
        System.out.println(a);              // print the output//
        System.out.println(b);
        System.out.println(c);

    }

}
