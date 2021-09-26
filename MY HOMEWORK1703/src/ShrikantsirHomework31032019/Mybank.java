package ShrikantsirHomework31032019;
//.Create a class Bank with some banking methods(openAccount, depositeMoney, transferMoney etc...),
//Create another class MyBank and Extend the class Bank
//and create the same methods as parent class Bank methods to implement method overriding
public class Mybank extends Bank {
    public void openaccount(){
        System.out.println("account name is a");
    }
    public void depositmoney(){
        System.out.println("minimum deposit need to pay");
    }
    public void transfermoney(){
        System.out.println("transfer money minimum will be £5");
    }
    public static void main(String[] args){
        Mybank obj = new Mybank();
        //obj.transfermoney();
        //obj.openaccount();
       // obj.depositmoney();
      Bank obj1  =new Mybank();
      obj1.depositmoney();
      obj1.openaccount();
      obj1.transfermoney();
    }
}
//imp: if method name is same then even you sort the value in parent class variable by create
// object in child classs java compiler will call only child class method if all the methods name
//are same and default(no data type or vriable)
