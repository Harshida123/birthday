package Inheritance2;                      // create package//

public class Testclasspenvsoffice {        //create a class//
    public static void main(String[]args){ //declare main method//
        //static polymorphisum//
        Pens p1 = new Pens();    //create a object in child class// //class name object=new class name(){//
        p1.red();    //calling the child class method by create object in child class//
        p1.blue();
        p1.chair(); //calling the parent class(super class) method by create object in child class//
        p1.table();
        p1.cupboard();
        p1.orange(); // calling grad parent class method by create object in child class//

        System.out.println("*****");
        Office f1 = new Office();  // create object in parent class method//
        f1.chair();               //calling the parent class method by using the object//
        f1.table();
        f1.cupboard();
        f1.orange();
        // calling the grand parent class method by using parent class(sub class) object//
        System.out.println("*****");

        // upper casting//
        Office c1 = new Pens();// child class object will be referred by parent class variable
                              //this is called the dynemic polymorphisum//
        c1.chair();  // calling the parent method by creating the another object in parent class//
        c1.table();
        c1.cupboard();
        c1.orange(); //calling the grand parent method by using the another objetc in parent class//


    }


}
