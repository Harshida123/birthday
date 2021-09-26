package ExceptionHandlingConcept;

public class ExceptionHandling1 {   //create class
    public static void main(String[] args){   //main method
        try{                             // try method to through the exception
            int d=20/0;
        }
        catch (ArithmeticException e){   //catch method ,to catch the exception by Arithmetic exception method
            e.printStackTrace();        // print the exception use .printStackTrace(); method
        }
        System.out.println("Hello World");  //then only you will print
        System.out.println("HI,How are you");
        System.out.println('M');
        System.out.println("take care");

    }
}
// d=20.44/0 ,the answer will be indefinate because of that java compiler through the exception and the use try and catch method .
