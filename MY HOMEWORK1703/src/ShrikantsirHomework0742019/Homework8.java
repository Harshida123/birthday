package ShrikantsirHomework0742019;
//Please write sample programs to demonstrate the below oops concepts:
// a. polymorphism (method overloading and method overriding)
public class Homework8 {
    public void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    public void add(long d,long f){
        long y=d-f;
        System.out.println(y);
    }
    public static void main(String[]args){
        Homework8 obj=new Homework8();
        obj.add(10,20);
        obj.add(20,30);

    }

}
