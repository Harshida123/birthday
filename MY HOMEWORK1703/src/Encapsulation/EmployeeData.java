package Encapsulation; // create a package//

public class EmployeeData {  //create a class//
    //step 1. create a private data type variables so variable can not direct access outside the class//
    private int age;     //create private int variables//
    private int dob;
    private String employeename; // create string variables//

    public static void main(String[] args) { // create a mainmethod//
        EmployeeData emp=new EmployeeData(); // create object,classname object=new classname();
        emp.setAge(20);   // calling the set method by object and assign values for variable//
        emp.setDob(71181); //syntex is object.methodname();//
        emp.setEmployeename("sandip");
        System.out.println("employee age="+emp.getAge());//print out by calling the get method//
        System.out.println("employee dob="+emp.getDob());
        System.out.println("employeename="+emp.getEmployeename());

    }

 //step 2.Getter and setter method: calling the set and get method //
     // how to call get and set method: right click-go to refactor-go to encapsulation field//
    //- click all the variable-click public//
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }
}


