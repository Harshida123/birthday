package SCANNERCLASS;

import java.util.Scanner;

public class Scannerclass1 {
    public static void main(String[] args){
        String a = ("HELLO KETANBOSS");
        Scanner obj = new Scanner(a);
 System.out.println("The first word of string is:"+obj.next() );
 System.out.println("The second word of string is : "+obj.next());

 String b= "1,2,3,4,5,6";
     Scanner obj1 = new Scanner(b);
     System.out.println(obj1.next());
    }
}












// import java.util.Scanner;  = import statement
//syntex = Scanner object(fromkey) = new Scanner(System.in);
