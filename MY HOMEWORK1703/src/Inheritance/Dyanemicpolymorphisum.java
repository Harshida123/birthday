package Inheritance;

public class Dyanemicpolymorphisum {
    public static void main(String[] args){
        //Top casting is create a object in parent class and compare with child class//
        Car c1=new Bmw(); //create object in Car class and compare with Bmw class//
        c1.start(); // as you see when you run the programm even through mathod name is same
                   //in child and parent class java compiler give perferance to child class method name
                   //its called the method override//
        c1.stop(); //calling the Car method by using the object// //syntex is object.method name();//
        c1.refuel();//calling the Car method by using the object// //syntex is object.method name();//

       //DOWN casting


         //need to create a example//// shows error message , can not create down casting//
    }
}
 //IMP: Child class object can be referred by the parent class variable but parent class can not
// access the property of child class, its called the dyanemic polymorphisum or run time polymorphisum//
// IMP: WE CAN NOT CREATE A DOWN CATING MEANS CREATE A OBJECT IN CHILD CLASS AND COMPARE WITH PARENT CLASS
//, TAHT MEAN CHILD CLASS CAN FIT WITH PARENT BUT PARENT CLASS AN NOT FIT WITH CHILD CLASS//
//IMP : SMALL THINGS CAN FIT IN TO BIG THINGS BUT BIG THINGS CAN NOT FIT IN THE SMALL THINGS//