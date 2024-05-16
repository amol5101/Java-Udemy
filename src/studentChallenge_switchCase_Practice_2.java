/*
Student Challenge
Write a menu-driven program for arithmetic operations.
    MENU: ADD, SUB, MUL, DIV
 */

import java.util.Scanner;

public class studentChallenge_switchCase_Practice_2 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Two numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("Enter which operation you want to perform ( ADD / SUB / MUL / DIV ): ");
        String op = sc.next();

        switch (op){
            case "ADD":
                System.out.println(n1 + n2);
                break;
            case "SUB":
                System.out.println(n1 - n2);
                break;
            case "MUL":
                System.out.println(n1 * n2);
                break;
            case "DIV":
                System.out.println(n1 / n2);
                break;
            default:
                System.out.println("You have entered out of menu operation !!!");
                break;

        }

    }
}
