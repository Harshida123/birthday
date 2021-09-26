package ShrikatsirHomework15042019;

import java.util.ArrayList;
import java.util.Iterator;

//2. Create an array of 10 int values and print using while loop with iterator
public class ArrayLesson2 {

        int a;
        int b;
        int c;
        ArrayLesson2(int a,int b,int c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        public static void main(String[] args){
            ArrayLesson2 a1=new ArrayLesson2(10,20,30);
            ArrayLesson2 a2=new ArrayLesson2(5,5,5);
            ArrayLesson2 a3 = new ArrayLesson2(2,2,2);
            //create a arraylist
            ArrayList<ArrayLesson2>M1=new ArrayList<>();
            M1.add(a1);
            M1.add(a2);
            M1.add(a3);
            //by using the iterator traverses the value
            Iterator<ArrayLesson2> M2=M1.iterator();
            while(M2.hasNext()){
             ArrayLesson2 emp   =M2.next();
             System.out.println(emp.a);
             System.out.println(emp.b);
             System.out.println(emp.c);
            }

        }

}
