import java.util.*;

public class arrays {
    public static void main(String args[]){

        // Declaring array

        int array[] = new int[10];      // Declared an array of size 10
        int[] array1 = new int[10];      // Declared an array of size 10

        int arr[] = {1, 2, 3, 4, 5};    // Declaring as well as initializing an array

        int A[];
        A = new int[10];


        // Printing the elements of an array

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);


        // printing all the elements of an array using for loop

//        for(int i = 0; i < arr.length; i++){        // .length is the property of array in java to find the length of an array
//            System.out.print(arr[i]+" ");
//        }


        // printing all the elements of an array using for each loop

//        for(int x : arr){
//            System.out.println(x);
//        }

        // if we declare the int array but not initialized it then every element will have default value 0

        for(int x : array){
            System.out.println(x);
        }


    }
}
