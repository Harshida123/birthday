package SCANNERCLASS;

import java.util.Scanner;

public class Scannerclass2 {
    public static void main(String[] args){

        Scanner obj2 = new Scanner(System.in);
        System.out.println("please enter the number:");
        int num = obj2.nextInt();
        System.out.println("the number you enter is :"+num);
    }
}
