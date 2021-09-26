package ShrikantsirHomework0742019;
// coverting the Char Data type in to the String data type example

public class ExerciseIV {
    public static void main(String[] args){
        char[] A ={'H','e','l','l','o'}; //create a variable in char datatype
        String b= new String(A);//create a obj in string and its ref. to string variable
        System.out.println(b); //print
      //  System.out.println(b.intern()); //String intern method
      //  System.out.println(b.hashCode());//hashcode method in string
       //System.out.println(b.toLowerCase());//tolowercase method in string

    }
}
//imp: intern string method give us total value of string variable
//imp: hashcode method give code of the string

