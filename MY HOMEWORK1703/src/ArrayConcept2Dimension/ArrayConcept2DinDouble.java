package ArrayConcept2Dimension;

public class ArrayConcept2DinDouble {
    public static void main(String[]args){
        double b[][]=new double[2][3];
        //System.out.println(b.length);
       // System.out.println(b[0].length);
        b[0][0]=20.22;
        b[0][1]=10.99;
        b[0][2]=15.44;

        b[1][0]=5.78;
        b[1][1]=1.99;
        b[1][2]=2.99;
        //System.out.println(b[0][2]);
       // System.out.println(b[1][2]);
        for(int c=0;c<b.length;c++){        //think c as row
            for(int d=0;d<b[0].length;d++) {  //think d as column
                System.out.println(b[c][d]);
            }

                }
            }

        }


