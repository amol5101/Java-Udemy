/*
Student Challenge : Conditional Statements simple tasks
Find the number is even or odd
Find the person is young or not
Find grades for a given marks
 */

import java.util.*;

public class studentChallenge_conditionalStatementsTasks {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

//        Find the number is even or odd
//        int n = sc.nextInt();
//        if(n % 2 == 0)
//            System.out.println(n + " is Even number.");
//        else
//            System.out.println(n + " is odd number.");


//        Find the person is young or not
//        System.out.println("Enter your Age : ");
//        int age = sc.nextInt();
//
//        if((age >= 14) && (age <= 55))
//            System.out.println("You are Young!");
//        else
//            System.out.println("Your are not young");


//        Find grades for a given marks
        System.out.println("Enter the marks you got in English, Math & Science : ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        int avg = total / 3;

        System.out.println("Total marks you got are : "+total);

        if(avg >= 70)
            System.out.println("You got Grade A.");
        else if (avg >= 60 && avg < 70)
            System.out.println("You got Grade B.");
        else if(avg >= 50 && avg < 60)
            System.out.println("You got Grade C.");
        else if(avg >= 40 && avg < 50)
            System.out.println("You got Grade D.");
        else if(avg < 40)
            System.out.println("You got Grade F.");

    }
}
