package IFELSECONCEPT;

public class Checknumbercount {

    static int counter = 0;

    public static boolean Sevennumbers(int a, int b) {

        while (a>0){
            if(a%10==b){
                counter++;
                System.out.println("a== "+a+" counter== "+counter);
            }
            a=a/10;
        }
        return (a>0);
    }
    public static void printsevennumber(int c,int b){
        for(int i=0;i<=c;i++){
            Sevennumbers(i,b);
        }
    }
    public static void main(String[]args){
        int c=177;
        int b=7;
        printsevennumber(c,b);
    System.out.println("System Found "+b+" Number from 0 to " +c+" is  *"+counter+"* times. Nice one..");
    }
}