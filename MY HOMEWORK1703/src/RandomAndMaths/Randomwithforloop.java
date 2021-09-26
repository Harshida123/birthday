package RandomAndMaths;

import java.util.Random;

public class Randomwithforloop {
    public static void main(String[] args) {
        Random obj = new Random();
        int b;
        for (b = 1; b <= 10;b++ ) {
            System.out.println(obj.nextInt(20));

        }
    }
}