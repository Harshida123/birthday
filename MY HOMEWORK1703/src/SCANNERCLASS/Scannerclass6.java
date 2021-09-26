package SCANNERCLASS;

import java.util.Scanner;

public class Scannerclass6{
    public static void main(String[] args){
        String b ="1 2 3 4 5 6 7 8 9";
        Scanner obj =new Scanner(b);

        while(obj.hasNextInt()){
            System.out.println(obj.nextInt());
        }
    }

}

