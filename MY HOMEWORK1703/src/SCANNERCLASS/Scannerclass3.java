package SCANNERCLASS;

import java.util.Scanner;

public class Scannerclass3 {
    public static void main(String[] args){

        String a = "1 2 3 4 5";
        Scanner obj = new Scanner(a);
        System.out.println("the number are :");
        while(obj.hasNextInt()){
            System.out.println( obj.nextInt());
        }
    }

}
