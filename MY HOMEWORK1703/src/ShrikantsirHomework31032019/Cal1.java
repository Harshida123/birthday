package ShrikantsirHomework31032019;

public class Cal1 {
    public static int multiple(int a ,int b){
        int c;
        return c=(a*b);
    }
    public static int multiple(int a,int b,int c){
        int d;
        return d=(a*b*c);
    }
    public static void main(String[] args){
        int c = multiple(10,20);
        int d =multiple(10,20,30);
        System.out.println(c);
        System.out.println(d);
    }
}
//IMP: Example of method overloading ,name of the method will be same but number of arguments changes
//IMP: Number of arguments means variable different and data type and method name same.