package ExceptionHandlingConcept;

public class ThrowKeyword3 {
    public static void main(String[] args){

        System.out.println("the mountain");
        try{
            throw new Exception("Name");
        }
        catch(Throwable a){
            a.printStackTrace();
            System.out.println(a.getMessage());
            System.out.println("Exception working fine now");


        }

        System.out.println("HELLO");
    }
}
