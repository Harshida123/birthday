package Methodwitharguments;

public class Calculation {
    public static void main(String[] args){
        addition(10,20,30);
        addition(1000,20000,3000);
        addition(4,6,10);
        addition(12,13,14);
        addition(15,15,15);
        addition(20,20,20);
        addition(1000,20000,15000);
        addition(1547,1289,1567);

    }
    public static void addition(int a,int b,int c){
        int d= a+b+c;
       // System.out.println(a+b+c);
        System.out.println("addition of "+a+" and "+b+" and"+c+"="+d);
    }
}
