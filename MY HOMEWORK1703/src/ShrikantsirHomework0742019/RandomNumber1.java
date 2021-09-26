package ShrikantsirHomework0742019;
//Create a class with a method which can generate random number
import java.util.Random;

public class RandomNumber1 {
    public static void main(String[] args){
        Random A=new Random();
        int b=A.nextInt(15);
        System.out.println(b);
    }
}
