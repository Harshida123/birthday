package IFELSECONCEPT;

public class Checknumbercount1 {
    static int counter1=0;
    public static boolean countnumber(int a,int b){
        while (a>0){
            if(a%10==b){
                counter1++;
                System.out.println("a== "+a+"counter1== "+counter1);
            }
            a=a/10;
        }
        return (a>0);
    }
    public static void printnumber(int c,int b){
        for(int i=0;i<=c;i++){
            countnumber(i,b);
        }
    }
    public static void main (String[] args){
        int c=1000;
        int b=7;
        printnumber(c,b);
        System.out.println("The number we looking for" +b+ " from 0 to"+c+ "is *"+counter1+"*times. Nice one ");
    }
}
