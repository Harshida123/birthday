package ArrayConcept2Dimension;

public class ArrayConcept2D {
    //Array two dimension program in String data type
    public static void main(String[]args){
        String a[][]=new String[3][5];//syntex of 2 dimension array
        System.out.println(a.length); //syntex to print the row because it 2 dimension array
        System.out.println(a[0].length); //system to print column because it 2 dimension array
        a[0][0]="A";  //veriable 0 row 0 column =vaule assign in string
        a[0][1]="B";
        a[0][2]="C";
        a[0][3]="D";
        a[0][4]="E";

        a[1][0]="A1"; // variable 1 row 0 column =value assign in String
        a[1][1]="B1";
        a[1][2]="C1";
        a[1][3]="D1";
        a[1][4]="E1";

        a[2][0]="A2";
        a[2][1]="B2";
        a[2][2]="C2";
        a[2][3]="D2";
        a[2][4]="E2";
       // System.out.println(a[0][1]);
       // System.out.println(a[1][1]);
       // System.out.println(a[2][1]);
        for(int row=0;row<a.length;row++){  // 2D ARRAY WE HAVE TO USE 2 FOR LOOPS
            for(int column=0;column<a[0].length;column++){
                System.out.println(a[row][column]);
            }
        }


    }
}
