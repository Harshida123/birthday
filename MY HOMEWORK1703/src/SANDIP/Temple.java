package SANDIP;

public class Temple {
    public void colour(){
        System.out.println("THE TEMPLE COLOUR WILL BE RED");
    }
    public void location(){
        System.out.println("THE LOCATION IS ON HIGH STREET");
    }
    //inside the main method ,call the methods on the beautiful object
    public static void main(String[] args){
        Temple beautiful=new Temple();
        beautiful .colour();
        beautiful.location();

    }
}
