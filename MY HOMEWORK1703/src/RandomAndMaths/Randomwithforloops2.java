package RandomAndMaths;

import java.util.Random;

public class Randomwithforloops2 {
    public static void main(String[] args){
        Random obj =new Random();
        int c;
        for(c=1;c<=10;c++){
            System.out.println(obj.nextInt(5));
        }
    }
}
