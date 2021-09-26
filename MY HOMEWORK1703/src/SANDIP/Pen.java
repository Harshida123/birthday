package SANDIP; // calling the methods in main method by creating the object//

public class Pen {      //create a Pen class//
    public void  Blue() {  //create a Blue method//
                           // method name will be lower cases//
        System.out.println("pen is working fine");//write a statement in Blue method//
    }
    public void Red(){   //create a Red method//
        System .out.println("And it so quick"); // write a statement in Red method//
    }
    public static void main(String[] args){  //create a main method//
        Pen fine=new Pen();  //create  object as a fine//
        fine.Blue();      // call the Blue() method//  // syntex object.call method();//
        fine.Red();       // call the Red() method// //  syntex objetc.call method();//


    }
}
