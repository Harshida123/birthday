package ShrikantsirHomework31032019;
// write a program and compare 3 value and print greatest vaule
public class Exercisepart1 {
    public static void main(String[] args){
        int a =100;
        int b =200;
        int c =500;

        if (a>b && a>c){      //false false
            System.out.println("a is greater then b and c ");

        }
        else if(b>c){        //false
            System.out.println("b is greater then a and c");
        }
         else {      //true
             System.out.println("c is greater then a and b");
        }
    }
}
