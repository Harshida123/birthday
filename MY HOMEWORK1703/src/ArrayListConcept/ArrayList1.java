package ArrayListConcept;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args){
        //DYNEMIC ARRAYS(ONE OF THEM IS ARRAYLIST)
        ArrayList ab= new ArrayList();    // CLASSNAME OBJ=NEW CLASSNAME();
        ab.add(10); //0  IS A INDEX NUMBER
        ab.add(20); //1
        ab.add(30); //2
        ab.add(40); //3
       // System.out.println(ab.size()); //TO FIND OUT SIZE OF Array list used size method
        ab.add(50); //4
        ab.add(50); //5
        ab.add(30); //6
        ab.add(70); //7
        System.out.println(ab.size()); //used size method for find out size of array list
       System.out.println(ab.get(5)); // used get method to find out values of index
      for(int i=0;i<ab.size();i++){   //used for loop to print all the values of Arraylist
          System.out.println(ab.get(i));

      }
    }
}
//imp: By arraylist we will get duplicate value or  elements as well
// you can apply state different datatype variable value in array methods
