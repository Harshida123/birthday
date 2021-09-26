package StringManiPulation;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "Today is Fasting Day";  // INDEX START FROM 0
        System.out.println(s1.charAt(10)); //charAt method use to get character in string by dropping value
        System.out.println(s1.indexOf('F'));//index of method use to get value of character in string
        System.out.println(s1.length());   // length method is use to get total number of character in string
        System.out.println(s1.indexOf('a', 4));//this method use when you have similar character and you have print second same character value
        System.out.println(s1.indexOf('y', 6));

        System.out.println(s1.indexOf("Fasting"));//indexof string method give you value of individual string
        System.out.println(s1.indexOf("Helloo"));//if its no index on string then its print -1 always
        String s2 = "Today is Fasting Day";

        System.out.println(s1.equals(s2));//equal method is use for compare the string,reaction will be in boolean
        String s3 = "Today is fasting Day";
        System.out.println(s1.equals(s3));  //s and s3 is not equal ,as java is case sensitive language
        System.out.println(s1.equalsIgnoreCase(s3));//this method is use to ignore case in two different string
        //Substring
        System.out.println(s1.substring(0, 8));
        System.out.println("**********");
        //trim method
        String s4 = "   Hello  world   ";
        System.out.println(s4.trim()); //trim method use to take a space out from starting and ending of string
        //replace method
        String s5 = "07_07_2011";
        System.out.println(s5.replace('_', '/'));//replace char in string use this mehtod
        //  concat
        String s6 = "care";
        System.out.println(s6.concat("s"));//this method is use for add the character or number in string
        //split method
        System.out.println("******");
        String s7 = "Hello_ world_selenium";  //split method spilt the string
        String obj[] = s7.split("_");  //you have to store the each string in array object
        for (int i = 0; i < obj.length; i++) {  //use the for loops
            System.out.println(obj[i]);
            System.out.println("*******8");
            String x = "helloo";
            String y = "world";
            int a = 5;
            int b = 5;
            System.out.println(x + y + a + b);  //print out start form leftside of string se the output
            System.out.println(a + b + x + y);
            System.out.println(x + y + (a + b));
            //split method
          //  String s8 = "hi/i am/fine";
          //  String obj1[] = s8.split("/");
           // for (int z = 0; z < obj1.length; z++) {
           //     System.out.println(obj1[z]);
           // }
        }
                String s9="i am fine";
                System.out.println(s9.toLowerCase());// this method convert all string in lowercase
                System.out.println(s9.toUpperCase());//this method convert all string in uppercase
 // how to reverse the string
        String s10 ="i am in train";
        StringBuffer obj2=new StringBuffer(s10);
        System.out.println(obj2.reverse()); //use reverse method in StringBuffer,reverse not available in string
        System.out.println(obj2.append(0));// use append method to see out put


    }
}





