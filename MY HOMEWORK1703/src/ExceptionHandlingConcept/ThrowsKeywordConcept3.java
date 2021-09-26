package ExceptionHandlingConcept;

public class ThrowsKeywordConcept3 {
    public static void main(String[] args) {
        ThrowsKeywordConcept3 obj = new ThrowsKeywordConcept3();
        obj.multiple();


    }
    public void  multiple() {

      try{
          div();
      }
      catch(Exception B){
          B.printStackTrace();
          System.out.println(B.getMessage());
          System.out.println("hi");

      }

    }
    public void div(){
        int b =2/0;
        System.out.println(b);

    }

}