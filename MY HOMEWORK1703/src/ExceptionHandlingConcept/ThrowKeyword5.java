package ExceptionHandlingConcept;

public class ThrowKeyword5 {
    public static void main(String[] args){

        System.out.println("abcd");
        try{
            throw new Exception("Hello world");
        }
        catch(Throwable A){
            A.printStackTrace();
            System.out.println(A.getMessage());
            System.out.println("world");
        }
        System.out.println("HI");
    }
}
