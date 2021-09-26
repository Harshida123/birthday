package ShrikantsirHomework31032019;
//1.Create a class Calculator with some calculation methods with same name to demonstrate method overloading
public class Methodwithreturn {
    public static void main(String[] args){
        int z= addition(20,25,30);
        int y= multiple(10,20);
        System.out.println(z);
        System.out.println(y);
    }

    public static int addition(int a ,int b,int c){
        int z;
        return z=(a+b+c);


    }
    public static int multiple(int d,int e){
        int y;
        return y=(d-e);

    }

}
