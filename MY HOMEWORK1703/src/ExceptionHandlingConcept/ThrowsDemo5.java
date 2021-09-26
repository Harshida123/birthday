package ExceptionHandlingConcept;

public class ThrowsDemo5 {
    public static void main(String[] args){
        ThrowsDemo5 obj1=new ThrowsDemo5();
        obj1.age();
        System.out.println("abc");
    }
    public void age(){
   try{
       add();
   }
   catch(Throwable a){
       a.printStackTrace();
   }
    }
    public void add(){
        int a=2/0;
    }
}
