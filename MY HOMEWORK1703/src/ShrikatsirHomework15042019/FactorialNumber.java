package ShrikatsirHomework15042019;
//Factorial meaning is ,
//4 factorial mean is =4*3*2*1
//6 =6*5*4*3*2*1
public class FactorialNumber {
    public static void main(String[] args){
        int a =4;
        int factorial=1;
        for (int i=1;i<=a;i++){
           //a= factorial*i;
            factorial*=i;
            System.out.println(a);
            System.out.println(factorial);
            //System.out.printf("the 4 factorial value is %d=%d",a,factorial);
        }

    }
}
