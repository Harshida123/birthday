package OOPSCONCEPT;

public class Metrobank implements USbank,Rbibank { //CREATE CLASS AND IMPLEMENTS WITH INTERFACE//
       //HOW TO CALL OVERRIDE: RIGHT CLICK IN CLASS AND SELECT GENERATE AND THEN //
       // SELECT OVERRIDE METHODS//
    //OVERRIDE METHOD FOR RBIBANK//
    public void loan() {
        System.out.println("....loan");
    }

    //Override FOR USBANK//
    public void debit() {
        System.out.println(".....debit");

    }
    //METROBANK CLASS METHOD NOT A OVERRIDE,its own method for metro bank//
    public void insurance(){
        System.out.println("metro.....insurance");
    }
}
