/*
Student Challenge :
Display name of a day based on number.
Find type of website and the protcol used.
 */

import java.util.Scanner;

public class studentChallenge_typeOrWebsite {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

//        Display name of a day based on number.

//        int day = sc.nextInt();
//
//        if(day == 1)
//            System.out.println("Monday");
//
//        else if(day == 2)
//            System.out.println("Tuesday");
//
//        else if(day == 3)
//            System.out.println("Wednesday");
//
//        else if(day == 4)
//            System.out.println("Thursday");
//
//        else if(day == 5)
//            System.out.println("Friday");
//
//        else if(day == 6)
//            System.out.println("Saturday");
//
//        else if(day == 7)
//            System.out.println("Sunday");
//
//        else
//            System.out.println("Invalid!");


//        Find type of website and the protocol used.

        String url = sc.nextLine();     // http://www.google.com

        String protocol = url.substring(0, url.indexOf(":"));
        String domain = url.substring(url.lastIndexOf("."));
        System.out.println(protocol);
        System.out.println(domain);

        if(domain.equals(".com"))
            System.out.println("Comercial");

        else if(domain.equals(".gov"))
            System.out.println("Government");

        else if(domain.equals(".org"))
            System.out.println("Organizational");

        else
            System.out.println("Any other type of Website.");


        if(protocol.equals("http"))
            System.out.println("Hypertext Transfer Protocol");

        else if(protocol.equals("ftp"))
            System.out.println("File Transfer Protocol");

        else
            System.out.println("Any other protocol");


    }
}
