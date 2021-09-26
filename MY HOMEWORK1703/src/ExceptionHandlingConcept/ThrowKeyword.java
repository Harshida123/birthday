package ExceptionHandlingConcept;
  //Example of ThrowKeyword
// By using of ThrowKeyword ,you can throw the your own exception in method
public class ThrowKeyword {
    public static void main(String[] args){
        System.out.println("Hello");

      try{
          throw new Exception("my name is sandip");//i throw the exception and use try and catch method
      }
      catch (Throwable b){
          b.printStackTrace();
      }
        System.out.println("world");
    }
}
//imp: You can throw the exception by using of throw keyword,for that you have to create a class
// and give the parameters in it by creating the object.
//  throw new Exception("my name is sandip");  : in this line new is object,Exception is class name, and
// inside the bracket send any parametres. And use the try block method i that method .