package ExceptionHandlingConcept;

public class ThrowKeyword4 {public static void main(String[]args){
    System.out.println("abc");
  try{
      throw new Exception("*******");
  }
  catch(Throwable B){
      B.printStackTrace();
      System.out.println(B.getMessage());
      System.out.println("ABCDE");


  }

    System.out.println("1,2,3,4");
}
}
