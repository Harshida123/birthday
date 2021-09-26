package IFELSECONCEPT;

public class Ifelse5 {
    public static void main(String[] args){
        int a=200;
        int b =300;
        int c=500;
        int d=75;
        if(a>b&a>c&a>d){        // false true true
            System.out.println("a is greatest");
        }
        else if(b>c&b>d){       //false true
            System.out.println("b is greatest");
        }
        else if (c>d){        //true
            System.out.println("c is greatest");

        }
        else{               //flase
            System.out.println("d is greastest");
        }








    }
}
