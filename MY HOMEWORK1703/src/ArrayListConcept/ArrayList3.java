package ArrayListConcept;
// generic Arraylist

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
         ArrayList<String> M =new ArrayList<String>();  //use wrapper class for String
        M.add("i am hero");    //0 index
        M.add ("i am supermen"); //1 index
        M.add("i am Swaminarayan"); //2index
          //System.out.println(M.size());
        //  System.out.println(M.get(2));
        // System.out.println(M.get(0));
        for(int a=0;a<M.size();a++){      //Use for loop and Given variable name a
            System.out.println(M.get(a));  //print
        }
    }
}



