package RandomAndMaths;

import java.util.Random;

public class RandomNumber {     //Create a class

    public static void main(String[] args) {  //declare main method
        Random obj = new Random();  //syntex classname obj =new classname//classname must be Random
        int a;            // assaign datatype and variable
        for (a = 1; a <= 5; a++) {   //use the for loops
            System.out.println(obj.nextInt(10));   //print out with nextlnt method

        }
    }
}


class RandomNumber2{
    public static void main(String[] args){
        Random OBJ2= new Random();
       int a= OBJ2.nextInt(100);
       System.out.println(a);
    }
}
