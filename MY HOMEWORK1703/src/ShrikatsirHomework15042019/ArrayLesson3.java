package ShrikatsirHomework15042019;
//4. Using the above values, write a program and print out the lowest number in the array.
public class ArrayLesson3 {
    public static void main(String[] args) {
        int a[] = {10, 15, 20, 25}; //initializing and declaring array
        c(a); //passing array in method
    }

    public static void c(int b[]) {//creating a method with array as a parameter
        int min = b[0]; //0 index
        for (int i = 0; i < b.length; i++) //use the for loops
            if (min > b[i]) //use if condition
                min = b[i];
               System.out.println(min);


            }
        }


//example of call the method in array method
