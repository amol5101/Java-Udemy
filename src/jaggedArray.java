/*

- Jagged array is the type of 2d array
- It is the 2d array in which the array members are of different size

 */

public class jaggedArray {
    public static void main(String[] args){

        // Creating jagged array

        int array[][];
        array = new int[3][];       // here we are declaring the number of columns only

        array[0] = new int[2];      // at each row creating an array of different size
        array[1] = new int[4];
        array[2] = new int[3];

        // Displaying the jagged array using for loop and for each loop

        // for loop
//        for (int i = 0; i < array.length; i++){
//
//            for (int j = 0; j < array[i].length; j++){
//                System.out.print(array[i][j]+" ");
//            }
//            System.out.println();
//        }

        // for each loop
        for(int x[] : array)
        {
            for(int y : x){
                System.out.print(y+" ");
            }
            System.out.println();
        }

    }
}












