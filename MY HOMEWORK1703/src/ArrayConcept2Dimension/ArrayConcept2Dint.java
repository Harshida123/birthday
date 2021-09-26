package ArrayConcept2Dimension;

public class ArrayConcept2Dint {
    public static void main(String[] args) {
        int a[][] = new int[3][4];

        a[0][1] = 35;
        a[0][2] = 65;
        a[0][3] = 'A';


        a[1][1] = 40;
        a[1][2] = 75;
        a[1][3] = 'B';
        a[2][1] = 30;
        a[2][2] = 85;
        a[2][3]='C';

        String b[][] = new String[3][4];
        b[0][0] = "john";

        b[1][0] = "TOM";

        b[2][0] = "Richrd";



        //System.out.println(a.length);
        // System.out.println(b.length);
        for (int c = 0; c < a.length; c++) {
           for (int column = 0; column < b.length; column++) {

                    System.out.println(a[c][column]);
                   System.out.println(b[c][column]);

                }
            }


        }
    }


