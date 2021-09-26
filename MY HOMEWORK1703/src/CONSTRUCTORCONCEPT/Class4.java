package CONSTRUCTORCONCEPT;

public class Class4 {
    //class variable
    String name;
    int age;
    int height;
    String colour;
    public Class4(String name,int age,int height,String colour){
        this.name = name; // this.class variable=local variable
        this.age = age;
        this.height= height;
        this.colour = colour;
        //this.class variable=local variable// //syntex when class and loacal veriable name same
    }
    public static void main(String[] args){
        Class4 obj4 = new Class4("SANDIP PATEL",36,5,"black");
        Class4 obj5 = new Class4("VIPUL PATEL",39,6,"blue");
        System.out.println(obj4.name);
        System.out.println(obj4.age);
        System.out.println(obj4.height);
        System.out.println(obj4.colour);
        System.out.println(obj5.name);
        System.out.println(obj5.age);
        System.out.println(obj5.colour);
        System.out.println(obj5.height);
    }
}
