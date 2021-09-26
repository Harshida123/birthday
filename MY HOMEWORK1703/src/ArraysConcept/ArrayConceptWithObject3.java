package ArraysConcept;
//object class array  use to store different data type values in array
//object is a super class in arrays
//Syntex is : classname object=new classname
public class ArrayConceptWithObject3 {
    public static void main(String[] args){
        Object M[] = new Object[6];
        M[0]="hello";  //string array
        M[1]='F'; //char array
        M[2]=30; //int array
        M[3]=10.25; //double array
        M[4]= true; //boolean array
        M[5]="WORLD"; //string array
      //  System.out.println(M[4]);
      //  System.out.println(M[1]);
      //  System.out.println(M[2]);
      //  System.out.println(M[3]);
      //  System.out.println(M[5]);
      //  System.out.println(M.length);  //length method to find the size of array
      for(int A=0;A<M.length;A++){      //used for loop for print all data type variable value in one go
          System.out.println(M[A]);
      }
    }
}
