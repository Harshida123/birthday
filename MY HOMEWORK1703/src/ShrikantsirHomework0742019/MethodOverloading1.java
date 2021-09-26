package ShrikantsirHomework0742019;
//Please write sample programs to demonstrate the below oops concepts
public class MethodOverloading1 {
    public void multiple(int a,int b) {

        int c = (a * b);
         System.out.println(c);
    }
    public void multiple(long c,long d){

       long f=c+d;
        System.out.println(f);
    }
    public static void main(String[]args){
        MethodOverloading1 obj =new MethodOverloading1();
        obj.multiple(10,20);
        obj.multiple(5,2);


    }

}
