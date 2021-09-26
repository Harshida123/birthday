package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator4 {
    String a;
    String b;
    String c;
    String d;
    String e;

    Iterator4(String a, String b, String c, String d, String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public static void main(String[] args) {
        Iterator4 obj = new Iterator4("HI", "HELLO", "NICE", "WORLD", "ENJOY IT");
        Iterator4 obj1 = new Iterator4("hope", "you", "ok", "need", "help");
        Iterator4 obj2 = new Iterator4("then", "let", "me", "know please", "Have a nice day");
        //generate arrylist
        ArrayList<Iterator4> ab = new ArrayList<>();
        ab.add(obj);
        ab.add(obj1);
        ab.add(obj2);
        //call the Iterator and traverses the value
        Iterator<Iterator4> emp = ab.iterator();
        while (emp.hasNext()) {
            Iterator4 emp1 = emp.next();
            System.out.println(emp1.a);
            System.out.println(emp1.b);
            System.out.println(emp1.c);
            System.out.println(emp1.d);
            System.out.println(emp1.e);
        }
    }
}         




