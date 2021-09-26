package ExceptionHandlingConcept;

public class ExceptionHandling {

    public static void main(String[] args) {
        //1. try and catch method
        //  int a;
        //a=7/0
        try {            //try is use to through the exception
            int b = 7 / 0;
        } catch (Throwable b) {  //catch is use to catch the exception
            b.printStackTrace();    //This method use for identifly the exception



        }
        System.out.println("hi");
        System.out.println("abs");
    }
    }
//Syntex of try block is :try{ data type and value}
//Syntex of catch method is: catch(Throwable or Exception variable){if you want then you can track exception
// by .printStackTrace(); method and also you can print your message by .getMessage(); method  }



//Imp: Throwable is super class of error and any exception.
//There are many exception methods in java like as Arithmetic or Exception etc
//you can write your own exception in method and decode it
//Try and catch is method to through the exception and catch the exception
//To trace the Exception ,there is a method call .printStackTrace();