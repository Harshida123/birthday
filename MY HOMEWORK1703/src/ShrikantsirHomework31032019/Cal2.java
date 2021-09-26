package ShrikantsirHomework31032019;

public class Cal2 {
    public static int add(int a,int b){     //
        return(a+b);
    }
    public static double add(double a ,double b,double c){
        return(a+b+c);
    }
    public static void main(String[] args){
        int sum =add(10,20);
        double total= add(10.5,20.3,30.40);
        System.out.println(sum);
        System.out.println(total);
    }
}
//IMP: EXAMPLE OF METHOD OVERLOADING BY CHANGING THE DATA TYPE ARGUMENTS
//IMP: DATA TYPE USED INT AND DOUBLE.