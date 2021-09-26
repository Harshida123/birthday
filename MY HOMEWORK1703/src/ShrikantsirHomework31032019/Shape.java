package ShrikantsirHomework31032019;
//2. Create a class Shape with some shapes methods with same name to demonstrate method overloading
public class Shape {
    public static String add(String triangle,String cube){
        String b;
        return b = triangle+cube;
    }
    public static String add(String round ,String star,String neno ){
        String C;
        return C = round+star+neno;

    }
    public static void main(String[] args){
        String b=add(+10+" ",+20+" ");
        String C=add("3","4","6");
        System.out.println(b);
        System.out.println(C);
    }

}
//IMP:EXAMPLE OF METHOD  OVERLOADING , METHOD NAME IS SAME BUT NUMBER OF ARGUMENTS HAS CHANGE.
//IMP: EXAMPLE OF METHOD OVERLOADING WITH RETURN BY USE OF DATA TYPE STRING AND  STRING VARIABLE.