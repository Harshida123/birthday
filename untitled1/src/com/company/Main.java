package com.company;

import java.util.LinkedList;

public class Main {



    public static void main(String[] args) {
	// write your code here
        /*double a =5.6;
        int b = (int) a;
        System.out.println(b);
        String c = "123";
        int d = Integer.parseInt(c);
        System.out.println(d);*/

        //practice p = new practice(20);
        /*try {
            String welcome = "welco";
            char[] chars = welcome.toCharArray();
            char lastchar = chars[chars.length];
            System.out.println(lastchar);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("code ran sucuessfully");*/

/*Tree favtree = new Tree(25,3,TreeType.Peacan);
        Tree favtree1 = new Tree(101,3,TreeType.Maple);
        System.out.println(favtree.grow());

        System.out.println(favtree1.annoucetallTree());
        System.out.println(favtree.annoucetallTree());*/
       /* Employee emp = new Employee("Harshida",50,20000,EmployeeCategory.sales);
        Employee emp1 = new Employee("Rita",50,25000,EmployeeCategory.sales);*/
       // Analyst emp2 = new Analyst("Harshida",51,4000);
        /*System.out.println("Employee Name : " + emp2.getName());
        System.out.println("Eligible to get bonus" +emp2.getannualbonus());


*/
       /* Employee emp3 = new Analyst("Rita",47,90000);
        emp3.raisesalery("marketing");
*/
        Employee emp4 = new Analyst("Rita",47,95000,EmployeeCategory.management);
        emp4.raisesalery();
        /*
        LinkedList<Employee> queue = new LinkedList();
        queue.add(new Analyst("harshida",50,60000,EmployeeCategory.human_resources));
        queue.add(new Analyst("Maulik",36,70000,EmployeeCategory.management));
        queue.add(new Analyst("Mamta",41,90000,EmployeeCategory.marketing));
        queue.add(new Analyst("Rita",47,50000,EmployeeCategory.sales));
        System.out.println(queue);*/
        Analyst emp7 = new Analyst("Harshida",40,4000,EmployeeCategory.management);
        System.out.println(emp7);
        emp7.raisesalery();
        System.out.println(emp7.deduction(500));






    }
}
