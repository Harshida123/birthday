package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class KetanLesson {
    String name;
    String grade;
    int age;
    int score;
    KetanLesson(String name,String grade,int age,int score){
        this.name=name;
        this.grade=grade;
        this.age=age;
        this.score=score;
    }
    public static void main (String[] args){
        //Create a object in constructor
        KetanLesson k1=new KetanLesson("JOHN","A",35,65);
        KetanLesson k2=new KetanLesson("TOM","B",40,75);
        KetanLesson k3= new KetanLesson("Richard","C",30,85);
        //create a Arraylist with the using of wrapper class
        ArrayList<KetanLesson> obj = new ArrayList<KetanLesson>();
        obj.add(k1);
        obj.add(k2);
        obj.add(k3);
        //Traverse the value by Iterator
   Iterator<KetanLesson> obj1 = obj.iterator();
   while(obj1.hasNext()){          //APPLY WHILE LOOPS
       KetanLesson obj3=obj1.next();
       System.out.println(obj3.name);
       System.out.println(obj3.age);
       System.out.println(obj3.score);
       System.out.println(obj3.grade);
   }
    }

}
