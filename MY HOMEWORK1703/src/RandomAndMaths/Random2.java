package RandomAndMaths;
//Create a class with a method which can generate random number
import java.util.Random;

public class Random2 {
    public static void main(String[] args){
        Random obj =new Random();
        int b = obj.nextInt();
        System.out.println(b);
    }
}

