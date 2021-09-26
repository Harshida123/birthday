package ShrikantsirHomework0742019;

public class Earth extends MethodOverriding1 {
    public void animal() {
        System.out.println("people are nice on earth");
    }
    public void birds(){
        System.out.println("helloooo");
    }
    public static void main(String[] args){
        Earth obj=new Earth();

        obj.animal();
        obj.birds();
        System.out.println("**********");
        MethodOverriding1 obj1=new Earth();
       obj1.animal();
        obj1.birds();

    }
}




