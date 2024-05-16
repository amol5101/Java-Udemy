import java.sql.SQLOutput;

public class stringMethods {
    public static void main(String args[]){

        String str = "Welcome";

        System.out.println(str.length());   // this method finds the length of the string

        System.out.println(str.toLowerCase());  // This will create same new string in lowercase

        System.out.println(str.toUpperCase());  // This will create same new string in uppercase

        String str1 = "   Hello   ";
        System.out.println(str1.trim());    // This method will remove all white space present in string and create new string

        System.out.println(str.substring(3));    // This method will crete new string from the 3 index to last index of the original string

        System.out.println(str.substring(2, 5));    // This will create new string begining from index 2 to the index 5-1.

        System.out.println(str.replace('e', 'k'));  // This will replace the mentioned old character with mentioned new one


        String str2 = "www.abcd.org";

        System.out.println(str2.startsWith("www"));     // This method check weather the string starts with the mentioned sequence or not
                                                        // If the string starts with the same then it returns true, otherwise false.

        System.out.println(str2.endsWith("g"));     // This method check weather the string ends with the mentioned sequence or not
                                                    // If the string ends with the same then it returns true, otherwise false.

        System.out.println(str2.charAt(4));     // This method returns the character present at the given index.

        System.out.println(str2.indexOf("ab"));     // This method returns the index of the given substring or character
                                                    // It starts searching from left to right
                                                    // If the given character or substring is not present then it returns the invalid index -1

        System.out.println(str2.lastIndexOf('.'));      // This method is same as the indexOf() method, but it starts searching from right to left.


        String str3 = "JAVA";
        String str4 = "java";
        String str5 = "python";
        String str6 = "python";

        System.out.println(str3.equals(str4));      // This method checks are both the strings are same or not
        System.out.println(str5.equals(str6));      // If both strings are equal it returns true else false.

        System.out.println(str3.equalsIgnoreCase(str4));    // This method checks are both the strings same or not.
        System.out.println(str4.equalsIgnoreCase(str5));    // But this method ignores the case

        System.out.println(str1.compareTo(str2));       // This method compare two strings according to the dictionary order

        System.out.println(str3.valueOf(10));

    }
}
