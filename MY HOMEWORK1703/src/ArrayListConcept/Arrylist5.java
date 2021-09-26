package ArrayListConcept;

import java.util.ArrayList;

public class Arrylist5 {
    public static void main(String[]args){
        ArrayList<String> M= new ArrayList<String>();
        M.add("i am super");   //0 index
        M.add("i am only one"); //1 index
        M.add("hello");    //2 index
        M.add("world");    //3 index
        ArrayList<String>M2=new ArrayList<String>();  //use String Wrapper class
        M2.add("hi");  //o index
        System.out.println(M.size());
        System.out.println(M2.size());
        System.out.println(M.get(2));
        System.out.println(M2.get(0));
        for(int a=0;a<M.size();a++){
            for(int b=0;b<M2.size();b++){
                System.out.println(M.get(a));
                System.out.println(M2.get(b));
            }

        }
        //*****************
        // ArrayList Methods example
      M.addAll(M2);
      for(int a=0;a<M.size();a++){
         System.out.println(M.get(a));
      }
      //********
      M.removeAll(M2);
      for(int b=0;b<M.size();b++){
          System.out.println(M.get(b));
      }


    }
}
