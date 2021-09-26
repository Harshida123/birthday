package ExceptionHandlingConcept;

public class ThrowsKeywordConcept {  //create class
    //Example of ThrowsKeyword
    public static void main(String[] args){    //main method
        ThrowsKeywordConcept obj = new ThrowsKeywordConcept();//create a object
     obj.sum();    //by object call the sum method

     System.out.println("abc");
    }
    public void sum(){    //create a sum method  and drop dev method in sum method as both are void so not a static
    div();
    }
    public void div(){  //create a div  method
       try{          //use the try method to through the exception
           int a=9/0;
       }
      catch(Throwable a){   // use catch method to catch the exception
           a.printStackTrace(); //to track the exception use .printStackTrace method
           System.out.println(a.getMessage()); //DROP YOUR OWN MESSAGE BY .getMessage();
           System.out.println("hello world"); //print your own message ,its helpful in UI method in automation

      }
    }
}
//imp: ThrowsKeyword use to handle the exception.In ThrowsKeyword we can not catch anything
// The purpose of ThrowsKeyword ,is always use when the method chaining.