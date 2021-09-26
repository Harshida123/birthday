package ShrikantsirHomework0742019;
//Please write sample programs to demonstrate the below oops concepts:
       // a. polymorphism (method overloading and method overriding)
      //Example of overrinding method
public class MethodOverridingClass { // create parent class
    public void bike() {   //create a method
        System.out.println("its running fast");
    }
}
 class Car extends MethodOverridingClass{  // create a child class and extends with parents class
    public void bike(){    //create asame method
        System.out.println("its nice bike");
    }
    public static void main(String[] args){  // main method
        Car obj = new Car();  //obj in child class
        obj.bike();   //calling the method but java will give preferance to child class method first
    }

        }



