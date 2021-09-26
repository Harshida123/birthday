package ShrikatsirHomework15042019;

import java.util.ArrayList;
import java.util.Iterator;

//2. Create an array of 10 int values and print using while loop with iterator
public class ArrayLesson2A {
    public static void main (String[] args){
        //creat arraylist
        ArrayList<Integer> obj=new ArrayList<Integer>();
        obj.add(10);  //0 index
        obj.add(20);  //1
        obj.add(30);  //2
        obj.add(40);  //3
        obj.add(50);  //4
        obj.add(60);  //5
        obj.add(70);  //6
        obj.add(80);  //7
        obj.add(90);  //8
        obj.add(100); //9
        System.out.println(obj.size());
        System.out.println(obj.get(7));
        //using iterator and traverses value
         Iterator<Integer> obj2 =obj.iterator();
         for(int i=0;i<obj.size();i++){
             System.out.println(obj.get(i));
         }
    }

}
