package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee {
    String name;
    int age;
    String job;
    Employee(String name,int age,String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public static void main(String[] args){
        //Create constructor class object
        Employee e1=new Employee("vipul",39,"QA");
        Employee e2 =new Employee("ketan",40,"Dev.");
        Employee e3=new Employee("sandip",35,"Manager");
        // Craete arraylist
        ArrayList<Employee> ab4= new ArrayList<>();
        ab4.add(e1);
        ab4.add(e2);
        ab4.add(e3);
        //Create a Iterator  and traverse the value
    Iterator<Employee> it    = ab4.iterator();
    while(it.hasNext()){
      Employee emp =  it.next();
      System.out.println(emp.name);
      System.out.println(emp.age);
      System.out.println(emp.job);

    }
     }
}
