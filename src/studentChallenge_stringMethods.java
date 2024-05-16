// Find username & domain name from email
// Find if the email is on  gmail or not
// suppose "programmer@gmail.com"
// So, username = programmer & domain = gmail

import java.util.Scanner;

public class studentChallenge_stringMethods {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
//        String email = "programmer@gmail.com";


        // method 1
//
//        for(String val: email.split("@",2)) {
//            System.out.println(val);
//        }
//
//        boolean x = email.endsWith("gmail.com");
//        if(x)
//            System.out.println("The given email is a gmail.");
//
//        else
//            System.out.println("The given email is not a gmail.");
//


        // Another method for the same

        int i = email.indexOf("@");
        System.out.println("Username is : "+email.substring(0, i));
        System.out.println("Domain name is : "+email.substring(i+1));

        if(email.contains("gmail"))
            System.out.println("Given email is the Gmail");

        else
            System.out.println("Given email is not Gmail");

    }
}
