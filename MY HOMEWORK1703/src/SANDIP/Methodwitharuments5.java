package SANDIP;

public class Methodwitharuments5 {
    public static void main (String[] args){
        multiple(10,5);
        multiple(25,5);
        multiple(100,5);
        multiple(400,20);

    }
    public static void multiple(int a,int b) {
        int c = (a * b);
        System.out.println("multiple of " + a + "and" + b + " =" + c);
    }
}
