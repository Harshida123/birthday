package OOPSCONCEPT;

public class Papa {   // CREATE A TEST CALSS FOR EXCUCTAED THE INTERFACE AND CLASS Metrobank//
    public static void main(String[] args){  // DECLARE MAIN METHOD//
        Metrobank m1 = new Metrobank();// CREATE A OBJECT IN CHILD CLASS AS IN INTERAFCE YOU CAN NOT CREATE A OBJECT//
        m1.debit(); // CALLING ALL THE INTERFACE METHOD BY OBJECT//
        m1.loan();
        m1.insurance();
   System.out.print(USbank.min_balace);//PRINT OUT INTERFACE VARIABLE//
        System.out.println(".......");
        USbank u1 = new Metrobank();// CREATE CHILE CLASS OBJECT AND ITS REFERED TO INTERFACE VARIABLE//
        u1.debit();                // BUT INTERFACE CAN NOT ACCESS THE CHILD CLASS PROPERTY//
       System.out.println("......");
        Rbibank r1 =new Metrobank();
        r1.loan();

    }
}
