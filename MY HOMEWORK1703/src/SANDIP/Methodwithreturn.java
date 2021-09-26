package SANDIP;

public class Methodwithreturn {
    public static void main(String[] args){ // create a main method//
        int d=addition(25,30,20); //create diiferent variable in same datatype//
        //int result=d*10;            //create a different variable in same data type//
       // int a= result-50;             //create a different variable in same data type//
        System.out.println(d);
       // System.out.println(result);
       // System.out.println(a);   // system print out//

    }
    public static int addition(int a,int b,int c){ //create a use defined method with use of method with return syntex//
   int d;
        return d = (a+b+c);  // declare return variable by useing the method with return syntex//
    }
    //IMP: Returning the data type will be same but stored the value in different variable//
    //IMP: System.out .println will be in main method//

}
