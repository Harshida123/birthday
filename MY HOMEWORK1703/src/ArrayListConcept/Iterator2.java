package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator2 {
    int a;
    int b;
    double c;
    Iterator2(int a,int b,double c){
        this.a=a;
        this.b=b;
        this.c=c;

    }
    public static void main(String[] args) {
        Iterator2 ab = new Iterator2(10,20,10.99);
        Iterator2 ab1 = new Iterator2(20, 30, 20.99);
        Iterator2 ab2 = new Iterator2(30, 20, 30.99);
        // create Arrylist and use of wrapper class
        ArrayList<Iterator2> b = new ArrayList<>();
        b.add(ab);
        b.add(ab1);
        b.add(ab2);
        //create Iterator and traverse the value
        Iterator<Iterator2> c = b.iterator();
        while (c.hasNext()) {
            Iterator2 Z = c.next();
            System.out.println(Z.a);
            //****************
            System.out.println(Z.b);
            //*******************
            System.out.println(Z.c);
        }
    }





}
