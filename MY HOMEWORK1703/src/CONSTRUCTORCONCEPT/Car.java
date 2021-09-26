package CONSTRUCTORCONCEPT;

public class Car {
    String car;
    int price;
    String colour;
    int engine;

    public Car(String car,int price,String colour,int engine){
        this.car = car;
        this.price =price;
        this.colour =colour;
        this.engine=engine;

    }
    public static void main(String[] args){
        Car obj1 = new Car("Honda",1000,"black",2);
        Car obj2 =new Car("Audi",2000,"Silver",4);
        System.out.println(obj1.car+" "+obj1.price+" "+obj1.colour+" "+obj1.engine);
        System.out.println(obj2.car+"  "+ obj2.colour+"  "+obj2.price+" "+ obj2.engine);
    }
}
