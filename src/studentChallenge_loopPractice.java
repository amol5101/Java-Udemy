/*

student challenge : loops practice
1. Display multiplication table of a given number
2. Display sum of n numbers.
3. Factorial of a given number.

 */
import java.util.Scanner;

public class studentChallenge_loopPractice {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

//        1. Display multiplication table of a given number
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= 10; i++){
//
//            System.out.println(i * n);
//
//        }

//        2. Display sum of n numbers.
//        int n = sc.nextInt(), sum = 0;
//
//        for (int i = 1; i <= n; i++){
//
//            sum = sum + i;
//
//        }
//        System.out.println(sum);


//        3. Factorial of a given number.

        int fact = 1, n = sc.nextInt();

        for (int i = n; i > 0; i--){

            fact = fact * i;

        }
        System.out.println(fact);


    }
}
