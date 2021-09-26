package ShrikatsirHomework15042019;
//5. Create an array of 10 values and write a program to print out only the odd numbers in the array
public class ArryLesson5 {
   // public static void main(String[] args) {
    //    int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};



   // System.out.println(a.length);
    //    for (int i = 0; i <= a.length; i++) {
     //       if(i%2!=0){
       //         System.out.println(i);

       //     }
      //  }
  //  }
    public static void main(String[]args){
        int a[]={1,2,3,4,5,6,7,8,9,10};
        c(a);
    }
     static void c(int b[]){
        int c=b[0];
        for (int i=0;i<=b.length;i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
     }

}
