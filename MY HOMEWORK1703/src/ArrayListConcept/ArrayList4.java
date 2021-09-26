package ArrayListConcept;

import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String[] args){
        ArrayList ab1=new ArrayList();
        ab1.add("JOHN");
        ab1.add(35 );
        ab1.add(65);
        ab1.add("A");
        ab1.add("Tom");
        ab1.add(40);
        ab1.add(56);
        ab1.add("B");
        ab1.add("Richard");
        ab1.add(30);
        ab1.add(46);
        ab1.add("C");
        for(int b=0;b<ab1.size();b++){
            System.out.println(ab1.get(b));
        }
    }
}
