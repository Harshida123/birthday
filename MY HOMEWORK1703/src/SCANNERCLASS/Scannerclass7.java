package SCANNERCLASS;
//Give the Datatype String and result come in int by use of Scanner class and hasNextInt
import java.util.Scanner;

public class Scannerclass7 {
    public static void main(String[] args){
        String b = "8 9 10 11 12 14 15";
        Scanner obj = new Scanner(b);

        while(obj.hasNextInt()){
            System.out.println(obj.nextInt());
        }
    }
}
