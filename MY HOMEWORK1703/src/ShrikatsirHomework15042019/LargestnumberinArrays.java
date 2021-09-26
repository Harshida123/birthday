package ShrikatsirHomework15042019;

import java.util.Arrays;

public class LargestnumberinArrays {
    public static void main(String[] args){
        int arr[]={10,20,30,50};
        int max= Arrays.stream(arr).max().getAsInt();
        System.out.println("the largest number=" +max);
    }
}
