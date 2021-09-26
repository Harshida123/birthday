package ExceptionHandlingConcept;

public class ThrowsKeywordConcept2 {
    public static void main(String[] args) {
        ThrowsKeywordConcept2 obj = new ThrowsKeywordConcept2();

   obj.name();

    }

    public void name() {
        try{
            add();
        }
        catch (ArithmeticException b){
            b.printStackTrace();
            System.out.println(b.getMessage());
            System.out.println("helllooooo");
        }
    }
    public void add(){
        int a=8/0;
   System.out.println(a);
    }

}

