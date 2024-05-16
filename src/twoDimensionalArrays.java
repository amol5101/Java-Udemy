

public class twoDimensionalArrays {
    public static void main(String[] args){

        // Ways for Declaring the 2D array

        int A[][] = new int[3][4];

        int B[][] ;
        B = new int[3][4];

        int[] D[];      // we can also declare like this here D is 2D array
        int[] E, F[];   // here E is 1D array and F is 2D array
        int[][] G, H, I;    // here all are 2D array


        // Declaring and initializing 2D array

        int C[][] = {{1,2,3,4},{2,4,6,8},{3,5,7,9}};


        //Displaying 2D array using for loop and for each loop

        // for loop
        for (int i = 0; i < C.length; i++){         // here c.length is the number of row in 2d array

            for (int j = 0; j < C[i].length; j++){      // here c[i].length is the each column in 2d array

                System.out.print(C[i][j]+ " ");
            }
            System.out.println();       // for new line after each row
        }

        // for each loop
        for(int x[] : C){
            for(int y: x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}




