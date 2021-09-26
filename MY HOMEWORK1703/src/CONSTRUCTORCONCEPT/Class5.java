package CONSTRUCTORCONCEPT;

public class Class5 {
    int a;
    char m;

    public Class5(int a,char m){
        this.a = a;
        this.m = m;
    }
    public static void main(String[] args){
        Class5 obj = new Class5(10,'M');
        System.out.println(obj.a);
        System.out.println(obj.m);
    }
}
