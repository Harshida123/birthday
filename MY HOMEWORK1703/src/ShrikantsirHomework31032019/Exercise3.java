package ShrikantsirHomework31032019;

public class Exercise3 {
    public static void main(String[] args){
        int A=95;
        int B= 89;
        int C= 69;
        int D = 36;
        int E = 35;
        if(A>B&A>C&A>D&A>E){
            System.out.println(" Grade A is greater then B,C,D,E");
        }
        else if(B>C&B>D&B>E){
            System.out.println("Grade B is greater then C,D,E");
        }
        else if(C>D&C>E) {
            System.out.println("Grade C is greater then D,E");
        }
        else if (D>E){
            System.out.println("Grade D is greater then E");
        }
        else {
            System.out.println("Grade E is greater ");
        }
        System.out.println("Grade A is marks between 90 to 100: "+A);
        System.out.println("Grade B is marks between 70 to 89: " +B);
        System.out.println("Grade C is marks between 37 to 69: " +C);
        System.out.println("Grade D mean marks is 36 - just pass ");
        System.out.println("Grade E >36 or fail");


    }
}
