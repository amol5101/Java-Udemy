/*
 Switch case is faster than if-else statements.
 it directly jumps on the suitable case without checking each and every case unlike if-else.
 */

import java.util.Scanner;

public class switchCaseDemo {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number( 0 - 5) : ");
        int n = sc.nextInt();

        switch (n){
            case 0:
                System.out.println("Zero");
                break;

            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");

            case 3:
                System.out.println("Three");

            case 4:
                System.out.println("Four");

            case 5:
                System.out.println("Five");

            default:
                System.out.println("You have entered the number out of menu !!!!");
                break;
        }

    }
}
