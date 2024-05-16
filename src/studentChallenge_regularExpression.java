/* Student Challenge
   Find is the number present in binary or not
   Find is a number is Hexadecimal or not
   Find is the data is in Date format or not(dd/mm/yyyy)
*/

import java.util.*;

public class studentChallenge_regularExpression {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

//        int no = sc.nextInt();

//******************************** Binary or not ****************************************************

//        // we need to convert that number into the string
////        String str = no+"";     // By this also we can convert
//
//        String str = "";
//        str = str.valueOf(no);      // converted into the string
//
//        if(str.matches("[01]*"))
////        if(str.matches("[0|1]*"))
////        if(str.matches("[0|1]+"))     These Regular expression can also be used for the same
//            System.out.println("The given number is in Binary Format.");
//
//        else
//            System.out.println("The given number is not in Binary Format.");

//************************************* Hexadecimal or not *******************************************

//        int n = 0x100AF;        // for hexadecimal 0x before the number
//
//        String str = ""; str = str.valueOf(n);      //  converting the number into the string
//
//        if(str.matches("[0-9A-F]+"))
//            System.out.println("given number is hexadecimal.");
//
//        else
//            System.out.println("given number is not hexadecimal.");

//************************************* Date format or not ********************************************

        String Date = sc.next();

//        if(Date.matches("[0-9/ ]{8,10}"))
        // or
        if(Date.matches("[0-3][0-9]/[01][0-2]/[0-9]{4}"))
            System.out.println("given data is in proper date format.");

        else
            System.out.println("given data is not in proper date format.");

    }
}
