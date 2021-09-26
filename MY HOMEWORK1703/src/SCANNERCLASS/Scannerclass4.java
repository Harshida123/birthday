package SCANNERCLASS;

import java.util.Scanner;

public class Scannerclass4 {
    public static void main(String[] args){
        String a = ("HELLO WORLD");
        Scanner obj = new Scanner(a);
        System.out.println("The first name of the world is:"+obj.next());
        System.out.println("the second name of worid is:"+obj.next());
    }
}
