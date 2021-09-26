package ShrikantsirHomework0742019;
//Create a class with a method which can generate random number
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args){
        Random A = new Random();

        System.out.println(A.nextInt(20));
    }
}
