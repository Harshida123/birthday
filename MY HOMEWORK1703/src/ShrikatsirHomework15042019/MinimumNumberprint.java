package ShrikatsirHomework15042019;

import java.util.Arrays;

public class MinimumNumberprint {
    public static void main(String[] args){
        int a[]={11,22,33,50,60};
        int Minimum= Arrays.stream(a).min().getAsInt();
        System.out.println("The Minimum number is"+ Minimum);
    }
}
