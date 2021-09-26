package ArraysConcept;

public class ArraysConcept1 {
    //Array: its used  to store similar data type value in array variable
    public static void main(String[] args) {
        //Start index(lowest bound index)= start with always 0
        // Ending index(upper bound index)= size-1
        //1. Example of int array
        int a[] = new int[4]; //Syntax of array:Data type variable[] =new data type[size of array];
        a[0] = 10;   //0 index
        a[1] = 20;   //1 index
        a[2] = 30;   //2 index
        a[3] = 40;   //3 index
        System.out.println(a[3]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a.length);
        for (int b = 0; b < a.length; b++) {  // b is a variable in for loop
            System.out.println(a[b]);
        }
    }
}
    //RULE OF ARRAYS:
    //1.if you want to find out size of array then use only .lenght method
    //2.if you want to print out all the values of array then use the FOR loops mehtod
    // Dis-advantages of arrays
    //1.Array size is fix thats the reason its called as a static arrays
    //2.In array you can  Stores only similar Data type values.
    //To overcome out of the dis-advantages of array problem
    //1.For size problem = we use the collection of array like as arrays list...Hashtable..or Dynamic arrays
    //2.For store different data type variable values use Object class array


