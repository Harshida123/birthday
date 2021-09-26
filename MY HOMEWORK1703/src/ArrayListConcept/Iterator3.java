package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator3 {

    String a;
    char b;
    int c;
    int d;
    int e;
    int f;
    Iterator3 (String a,char b,int c,int d,int e,int f){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }
    public static void main(String[] args){
        Iterator3 obj =new Iterator3("JOHN",'A',90,95,88,92);
        Iterator3 obj1 =new Iterator3("MARK",'B',70,75,74,72);
        Iterator3 obj2 = new Iterator3("NATAHN",'C',60,55,52,53);
        Iterator3 obj3=new Iterator3("MIKE",'D',40,45,47,44);
        Iterator3 obj4=new Iterator3("CHRIS",'F',20,25,30,29);
        Iterator3 obj5=new Iterator3("HERRY",'F',10,12,15,16);
        //CRAETE ARRAYLIST
        ArrayList<Iterator3> Y =new ArrayList<>();
        Y.add(obj);
        Y.add(obj1);
        Y.add(obj2);
        Y.add(obj3);
        Y.add(obj4);
        Y.add(obj5);
        //By use of Iterator traverses the values
        Iterator<Iterator3> G = Y.iterator();
        while(G.hasNext()){
        Iterator3 emp    =G.next();
        System.out.println(emp.a);
        System.out.println(emp.b);
        System.out.println(emp.c);
        System.out.println(emp.d);
        System.out.println(emp.e);
        System.out.println(emp.f);
        }
    }
}
