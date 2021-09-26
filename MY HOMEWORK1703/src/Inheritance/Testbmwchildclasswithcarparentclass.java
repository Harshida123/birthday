package Inheritance; //create a package//

public class Testbmwchildclasswithcarparentclass { //create class//
    public static void main(String[] args){ // apply a main method to verify sub class(Bmw)taking
                                            //inheritance form super class(Car)//
        Bmw b1=new Bmw();   // create object in sub(child) class(Bmw)//
                            //syntex is class name object=new class name();//
        b1.start();        //calling the Bmw method// // syntex is object.method name();//
        b1.safety();       //calling the Bmw method // // syntex is object.method name();//

        b1.stop();        // calling the Car method in Bmw craete object// //syntex is object.method name();//
        b1.refuel();
        b1.engine();
        // its called the static polymorphium or compiler time polymorphium//
        System.out.println("*****"); //calling the Car method in Bmw object// // syntex is object.method name ();//
        Car c1=new Car();
        c1.start();
        c1.stop();
        c1.refuel();

    }
    // IMP: Bmw class  has only two method but when you run this programm ,Bmw get the property of Car class//
    //IMP: Bmw first method name and Car first mehtod name is same so when java compiler run then
    // compiler give always perfreance to child class(sub class,(Bmw class),this method called as method overriding//
    //IMP: When you use the keyword for heristance " extends" is called  "as a relationhip"
    //SO as per exmple you can say Bmw has a relationship with Car or Bmw inheritance the properties of Car//
}
