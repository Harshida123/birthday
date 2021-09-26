package ShrikantsirHomework0742019;

public abstract class kashaypClass {
    abstract void m1();

    static {
        System.out.println("static block");
    }

    {
        System.out.println("instance block");
    }

     void Abstract() {
        System.out.println("Abstract cons");
    }
}
class Abs extends kashaypClass{
    @Override
    void m1() {
        System.out.println("m1 method");
    }
    Abs(){
        super ();
        System.out.println("normal class conc");
    }
    public static void main(String[] args){
        Abs a =new Abs();
        a.m1();
        a.Abstract();
        System.out.println(".........");
             kashaypClass k1 = new Abs();
             k1.Abstract();
             k1.m1();


    }
}


