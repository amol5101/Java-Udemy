/*

Types of loops in java
1. while loop
2. do while loop
3. for loop
4. for each loop


 */

public class loops {
    public static void main(String args[]){

        // while loop

//        int i = 1, n;

//        while(i < 100){

//            System.out.println(i);
//            i = i * 2;

//        }

        // do while loop

//        int i = 1;
//        do{
//
//            System.out.println(i);
//            i = i * 2;
//
//        }while(i<100);


        // for loop
        // Printing 1 to 10

        for (int i = 1; i <= 10; i++){

            System.out.println( i );

        }

        for (int j = 1, k = 2; j <= 10; j++, k=k*2){        // we can do it in that way also

            System.out.println(j+" "+k);

        }




    }
}
