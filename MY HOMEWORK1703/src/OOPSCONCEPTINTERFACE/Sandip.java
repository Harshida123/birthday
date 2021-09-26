package OOPSCONCEPTINTERFACE;

public class Sandip implements Ketan,Vipul{

    //Override
    public void body() {
        System.out.println("ketan .... body is strong");
    }

    //Override
    public void hand() {
 System.out .println("ketan .....hands are soft");
    }

    //Override
    public void eye() {
        System.out.println("ketan ....eyes are blue");

    }

    //Override
    public void colour() {
  System.out.println(" vipul.... skin colour is white");
    }
    //sandip own method not a override//
    public void  health(){
        System.out.println("sandip.... health is good");
    }
}
