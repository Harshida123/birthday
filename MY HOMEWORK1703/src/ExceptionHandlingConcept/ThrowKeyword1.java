package ExceptionHandlingConcept;

public class ThrowKeyword1 {
    public static void main(String[]args){
        System.out.println("HELLOOOO");
     try {
         throw new Exception("sandip");
     }
     catch(Throwable A){
         A.printStackTrace();
         System.out.println(A.getMessage());
         System.out.println("hello world");
     }
        System.out.println("hi");
    }
}
