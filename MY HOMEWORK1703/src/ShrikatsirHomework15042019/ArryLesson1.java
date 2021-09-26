package ShrikatsirHomework15042019;
//1. Create an array of 10 String values and print using foreach loop
public class ArryLesson1 {
    public static void main(String[] args) {
        String s[]=new String[10];
        s[0]="10";
        s[1]="20";
        s[2]="30";
        s[3]="40";
        s[4]="50";
        s[5]="60";
        s[6]="70";
        s[7]="80";
        s[8]="90";
        s[9]="100";
        System.out.println(s[8]);
        System.out.println(s.length);

        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
           // System.out.print(s[i]);
        }

    }
}