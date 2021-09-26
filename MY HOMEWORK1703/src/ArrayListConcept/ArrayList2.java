package ArrayListConcept;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList nb = new ArrayList();
        nb.add("Hello"); //0
        nb.add("world");//1
        nb.add(" hi"); //2
        nb.add('c');  //3
        nb.add(12.99); //4
        nb.add(true); //5
       //System.out.println(nb.size());
        //System.out.println(nb.get(1));
        //System.out.println(nb.get(0));
        //System.out.println(nb.get(4));
      //  for(int A=0;A<nb.size();A++){
         //   System.out.println(nb.get(A));
       // }
        //Generic Arraylist
        //Example of int arraylist
        ArrayList<Integer> ab1=new ArrayList<Integer>(); //use wrapper class for int
         ab1.add(100);//0
         ab1.add(50);//1
      //  System.out.println(ab1.size());
        for(int a=0;a<ab1.size();a++){
            System.out.println(ab1.get(a));
        }
    }
}
//imp : If you want add the same data type variable value in Arrylist then you have to use
// Wrapper class. In the Wrapper class int values will be given by Integer,String value
// given by String,char values given by Character and boolean value will be given by Boolean
// and double value will be given by Double