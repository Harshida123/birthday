package ShrikatsirHomework15042019;
//4. Using the above values, write a program and print out the highest number in the array.
public class ArrayLesson4 {
    public static void main(String[] args){
        int a[]={10,20,30,40,50};
        max(a);
    }
    public static void max(int b[]){
       int  c=b[0];
       for(int i=0;i<b.length;i++)
           if(c<b[i])
               c=b[i];
           System.out.println(c);


    }
}
