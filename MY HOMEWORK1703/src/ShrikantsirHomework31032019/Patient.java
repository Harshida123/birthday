package ShrikantsirHomework31032019;

public class Patient {
    int number;
    String name;       //Gobal variable
   static String hospital= "Northwick park";  //static variable
//constructor class
   Patient(int z,String p){  //create a constructor method with two variable
       number = z; //Gobal variable=local variable
       name= p;
   }
   void display(){   //create void method
       System.out.println(number+" "+name+"  "+hospital);
   }
   public static void main(String[] args){
       Patient P1 =new Patient(10,"vipul"); //classname obj=new classname
       Patient P2 = new Patient(20,"ketan");
       Patient P3 =new Patient(30,"Mike");
       P1.display(); //by object calling the display method
       P2.display();
       P3.display();
   }
}
