/*
Student Challenge : Switch Cases
1. Display name of the day based on number
2. Display name of a month based on number
3. Display type of website
 */

import java.util.Scanner;

public class studentChallenge_switchCase_Practice {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

//        1. Display name of the day based on number

//        System.out.println("Enter the number : ");
//        int n = sc.nextInt();
//
//        switch (n){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Entered invalid number !!!");
//                break;


//        2. Display name of a month based on number

//        System.out.println("Enter the number (1 - 12) : ");
//        int n = sc.nextInt();
//
//        switch (n){
//            case 1:
//                System.out.println("Jan");
//                break;
//            case 2:
//                System.out.println("Feb");
//                break;
//            case 3:
//                System.out.println("Mar");
//                break;
//            case 4:
//                System.out.println("Apr");
//                break;
//            case 5:
//                System.out.println("May");
//                break;
//            case 6:
//                System.out.println("Jun");
//                break;
//            case 7:
//                System.out.println("Jul");
//                break;
//            case 8:
//                System.out.println("Aug");
//                break;
//            case 9:
//                System.out.println("Sep");
//                break;
//            case 10:
//                System.out.println("Oct");
//                break;
//            case 11:
//                System.out.println("Nov");
//                break;
//            case 12:
//                System.out.println("Dec");
//                break;
//            default:
//                System.out.println("Entered invalid number !!!");
//                break;


//        3. Display type of website

        String url = sc.nextLine();     // www.google.com, www.mahadbt.gov, www.oracle.net, www.foundationindia.org, etc

        switch (url.substring(url.lastIndexOf(".")+1)){

            case "com":
                System.out.println("Commercial website");
                break;
            case "org":
                System.out.println("Organizational website");
                break;
            case "net":
                System.out.println("Network website");
                break;
            case "gov":
                System.out.println("Government website");
                break;
            default:
                System.out.println("Other type of website, IDK!!!!");

    }

    }
}
