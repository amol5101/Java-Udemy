
/*
Student Challenge :
Find Radix of the given number.
Find a given year is leap or not.
 */

import java.util.Scanner;

public class studentChallenge_findRadix_leapOrNot {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

//        Find Radix of the given number.

//        System.out.println("Enter the number : ");
//        String n = sc.next();
//
//        if(n.matches("[01]+"))
//            System.out.println("Radix of a number is : " + 2 + " (Binary)");
//
//        else if(n.matches("[0-7]+"))
//            System.out.println("Radix of a number is : " + 8 + " (Octal)");
//
//        else if(n.matches("[0-9]+"))
//            System.out.println("Radix of a number is : " + 10 + " (Decimal)");
//
//        else if(n.matches("[0-9A-F]+"))
//            System.out.println("Radix of a number is : " + 16 + " (Hexadecimal)");
//
//        else
//            System.out.println("Number is invalid.");


//        Find a given year is leap or not.

        int year = sc.nextInt();

        if ( year % 4 == 0 ){

            if ( year % 100 == 0 ){

                if ( year % 400 == 0 ){
                    System.out.println(year + " is a Leap Year.");
                }
                else
                    System.out.println(year + " is not a Leap Year.");
            }
            else
                System.out.println(year + " is a Leap Year.");

        }
        else
            System.out.println(year + " is not a Leap Year.");

    }
}
