package Encapsulation;

public class SandipData {
    private int dob;
    private int age;
    private int height ;
    private int weight;
    private String message;
    public static void main(String[] args){
        SandipData devi= new SandipData();
        devi.setDob(7111981);
        devi.setAge(36);
        devi.setHeight(5);
        devi.setWeight(72);
        devi.setMessage("devi is sandip wife");
        System.out.println(" Sandip DOB  = "+devi.getDob());
        System.out.println("Sandip AGE  =  "+devi.getAge());
        System.out.println("Sandip HEIGHT  = "+devi.getHeight());
        System.out.println("Sandip WEIGHT  = "+devi.getWeight());
        System.out.println("Sandip MESSAGE  = "+devi.getMessage());
    }
//getting the set and get method//
    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }




}
