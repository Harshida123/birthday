package ShrikantsirHomework31032019;

public class Exercise4A {      //create a class

     void bike() {       //make method final
        System.out.println("running");
    }
}
class honda extends Exercise4A {      //create  another class and extend with final method



    public static void main(String[] args) {
        honda h1 =new honda();
        h1.bike();
    }

}
//imp:1. create a final method
//   2.create a child class and extend with parents class
//   3.And same final method when you write down in another class its shows error
//   4. create object in main method and by that object calling the final method