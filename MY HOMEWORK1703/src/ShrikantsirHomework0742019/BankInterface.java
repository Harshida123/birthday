package ShrikantsirHomework0742019;
//1. Create a Bank interface and declare banking operation methods and variables
//2. Create classes BarclaysBank , LloydsBank or TescoBank.....
  //      and implement the Bank interface methods in all the above classes
  //      implement the method differently in different classes
//3. Create TestBank class and access the methods of above classes.
public interface  BankInterface {
    public void add(int a,int b);
    public void multiple(int c,int d);
    public void div(int e,int f);
}
 class Barclysbank implements BankInterface {

     @Override
     public void add(int a, int b) {
         int k=a+b;
         System.out.println(k);
     }

     @Override
     public void multiple(int c, int d) {
     int z=c*d;
     System.out.println(z);
     }

     @Override
     public void div(int e, int f) {
    int y=e/f;
    System.out.println(y);
     }
 }
 class Loyadsbank implements BankInterface {

     @Override
     public void add(int a, int b) {
         int A = a + b;
         System.out.println(A);
     }

     @Override
     public void multiple(int c, int d) {
         int B = c * d;
         System.out.println(B);
     }

     @Override
     public void div(int e, int f) {
         int C = e / f;
         System.out.println(C);
     }
 }
     class Tescobank implements BankInterface{

         @Override
         public void add(int a, int b) {
             int AA=a+b;
             System.out.println(AA);

         }

         @Override
         public void multiple(int c, int d) {
         int BB=c*d;
         System.out.println(BB);
         }

         @Override
         public void div(int e, int f) {
         int CC =e/f;
         System.out.println(CC);
         }
     }
  class Testbank {
      public static void main(String[] args) {
          Barclysbank obj = new Barclysbank();
          obj.add(10, 20);
          obj.multiple(5, 5);
          obj.div(16, 4);
          System.out.println("********8");
          Loyadsbank obj1 = new Loyadsbank();
          obj1.add(5,5);
          obj1.multiple(5,5);
          obj.div(10,2);
          System.out.println("**********");
          Tescobank obj2 =new Tescobank();
          obj2.add(2,2);
          obj2.multiple(2,2);
          try{
              obj2.div(2,0);
          }
          catch(Throwable m){
              m.printStackTrace();
              System.out.println(m.getMessage());
              System.out.println("Exception found");
          }
      }
  }
