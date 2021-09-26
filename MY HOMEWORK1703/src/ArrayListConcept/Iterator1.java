package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;
//Craete a constructor
public class Iterator1 {
    int a;
    double b;    //Gobal variable
    String c;
    Iterator1(int a,double b,String c){
        this.a=a;
        this.b =b;     //compare the global variable with local by this word
        this.c =c;
    }
    public static void main (String[] args){
        Iterator1 I1= new Iterator1(36,9.99,"I AM MEN");  //create a object in main method
        Iterator1 I2 =new Iterator1(5,5.555,"I AM SWAMINARAYAN");
        Iterator1 I3 =new Iterator1(15,6.666,"I AM VERY HAPPY");
        // craete Arraylist Syntex with Wrapper class name
        ArrayList<Iterator1>obj =new ArrayList<>();
        obj.add(I1);
        obj.add(I2);
        obj.add(I3);
        //Using the Iterator method and travelers the values
        Iterator<Iterator1> obj2=obj.iterator();
        while(obj2.hasNext()){
       Iterator1 emp     =obj2.next();
       System.out.println(emp.a);
       System.out.println(emp.b);
       System.out.println(emp.c);
        }


    }


}
