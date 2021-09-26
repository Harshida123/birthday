package ExceptionHandlingConcept;

public class ThrowKeyword2 {
    public static void main(String[] args){
        System.out.println("ketan");
        try {


            throw new Exception("sandip");

        }
        catch(Throwable A){
            A.printStackTrace();
        }
        System.out.println("vipul");
    }
}
