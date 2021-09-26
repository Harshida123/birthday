package IFELSECONCEPT;
//nested if else condition
public class Ifesle4 {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int c = 300;
        int d = 400;
        if (a > b && a > c && a > d) {   //false false false
            System.out.println("a is greatest");

        } else if (b > c && b > d) {     //false false
            System.out.println("b is greatest");
        } else if (c > d) {                //false
            System.out.println("c is greatest");
        } else {             //true
            System.out.println("d is greatest");
        }


    }










    }

