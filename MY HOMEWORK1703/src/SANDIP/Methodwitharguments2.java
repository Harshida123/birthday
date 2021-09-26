package SANDIP; // CREATE PACKAGE//

public class Methodwitharguments2 { // CREATE A CLASS//
    public static void main (String[] args){ // CREATE A MAIN METHOD//
        substraction(10,20,30);  //ASSIGN THE USE DEFINED METHOD IN MAIN METHOD WITHOUT CREATE OBJECT//
        substraction(100,50,25);
        substraction(2000,1000,5000);
        substraction(10000,20000,15000);
        substraction(500,200,100);

    }
    public static void substraction(int a,int b,int c){ //CREATE A USER DEFINED METHOD BY SYNTEX OF METHODWITH ARGUMENTS//
        int d=(a-b-c); //CREATE A ANOTHER VARIABLE//
        System.out.println("substraction of "+a+" and "+b+"and "+c+" = " +d);// SYSTEM PRINT OUT SYNTEX//
    }
}
     //IMP: WHEN YOU USE SYSTEM.OUT.PRINTL IS SYNTEX YOU HAVE TO REMEMBER THAT//

