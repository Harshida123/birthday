package com.company;

public class Employee {
     protected String name;
     protected int age;
     protected double salary;
     static String location;
    //private String [] category = {"sales","marketing","management"};
    EmployeeCategory cate;

     double bonus;


    public Employee(String name, int age, double salary,EmployeeCategory cate) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.cate = cate;


    }
/*

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
*/

    public void raisesalery(){



            if (this.cate == EmployeeCategory.sales){
                this.salary = salary +salary * 0.10;




            }
            else if (this.cate == EmployeeCategory.marketing) {
                this.salary = salary +salary * 0.20;




            }
            else if (this.cate == EmployeeCategory.management) {
                this.salary = salary +salary * 0.30;






        }
        System.out.println("Hurrey this month bonus is" + this.salary);

    }
    public double deduction(double sickpay){
         this.salary = salary -sickpay;
         return this.salary;
    }
    public String toString(){

        return this.name +this.age +this.salary + this.cate;

    }
}
