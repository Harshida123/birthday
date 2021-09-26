package SANDIP;

public class Methodwitharguments3 {  //create a class//
    public static void main(String[] args){ //create a main method//
        multiple(20,30);     //call to user define method in main method and give variable values//
        multiple(25,35);
        multiple(200,400);
        multiple(500,600);
        multiple(5000,4000);
        multiple(15000,20000);
        multiple(250,132);

    }
    public static void multiple(int a,int b){  //create use defined method with use oof syntex//
        int c =(a*b); //declare the another variable//
        System.out.println("multiple of"+a+" and "+b+" = " +c); //print out syntex//
    }
}
