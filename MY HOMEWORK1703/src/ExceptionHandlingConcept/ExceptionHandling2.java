package ExceptionHandlingConcept;

public class ExceptionHandling2 {  //create a class
    public static void main(String[] args){
        try{                  //use try method to through the exception
            int c=20/0;
        }
        catch(Exception a){  // use the catch method to identifly the exception  by exception method
            a.printStackTrace(); //trace method to print exception
            System.out.println(a.getMessage()); //you can print your own message in catch method by using
            System.out.println("helloooo");     // .getMessage
        }
        System.out.println('M'); //print out
    }
}
