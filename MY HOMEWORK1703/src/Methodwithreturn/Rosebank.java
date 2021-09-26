package Methodwithreturn;

public class Rosebank {
    public static void main(String[] args){
        int result = multiple(5,4,10);
        //System.out.println(result);
        int sum =result+100;
        //System.out.println(sum);
        int total = sum*10;
       // System.out.println(total);
       int sub = total-4000;
       //System.out.println(sub);
       int k = sub+2000-1000*20;
       System.out.println(k);
    }
    public static int multiple(int a,int b,int c){
        return (a*b*c);
    }

}
