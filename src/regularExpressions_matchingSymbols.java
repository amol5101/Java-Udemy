import java.sql.SQLOutput;

public class regularExpressions_matchingSymbols {
    public static void main(String args[]){

        String str = "m";
        String str1 = "%";
        String str2 = "0";
        System.out.println(str.matches("."));   // This matching symbol or expression returns true if
        System.out.println(str1.matches("."));   // any alphabet or number or symbol form keyboard present or not
        System.out.println(str2.matches("."));

        String str3 = "b";
        String str4 = "z";
        System.out.println(str3.matches("[abc]"));  // this will check if alphabet is among abc or not
        System.out.println(str4.matches("[abc]"));  // this will check if alphabet is among abc or not

        String str5 = "az";
        String str6 = "bx";
        System.out.println(str5.matches("[abc][vz]"));  // This will check first alphabet is from abc and second
        System.out.println(str6.matches("[abc][vz]"));  // from vz. if yes then true

        String str7 = "a";
        String str8 = "z";
        System.out.println(str7.matches("[^abc]"));     // This confirms that alphabet from given expression is not present in string
        System.out.println(str8.matches("[^bcy]"));     // if not present the returns true and if not present then false

        String str9 = "c";
        String str99 = "A9";
        System.out.println(str9.matches("[a-z1-7]"));   // Alphabet must be from either a to z or 1 to 7
        System.out.println(str99.matches("[a-z][0-9]"));    // if yes then true else false

        String str0 = "X";
        System.out.println(str0.matches("X|Y"));  // The alphabet must be X or Y then only true else false.

        String str00 = "YZ";
        System.out.println(str00.matches("YZ"));    // String is exactly same or not, if yes then true





    }
}
