/* Student Challenge
   Remove special character from a string
   Remove extra space from string
   Find number of words in a string
*/

public class studentChallenge_regularExpression_2 {
    public static void main(String args[]){

        // Remove special character from a string

        String str = "a!b@c#1$2%3";

//        System.out.println(str.replaceAll("[`!@#$%^&*()_=+~]*", ""));   // I have tried it
        System.out.println(str.replaceAll("[^a-zA-z0-9]", ""));   // The feasible way to do this


        // Remove extra space from string

        String str1 = " A m o l 0 5 ";
        String str2 = "abc     def   ghi  jkl mnop  qrstu        vwxyz";

        System.out.println(str1.replace(" ", ""));      // Removing all the spaces
        System.out.println(str2.replace(" ", ""));      // Removing all the spaces
        System.out.println(str2.replaceAll("\\s+", " "));       // (removing only extra spaces) if there are more than one space then replace it with only single space.
        System.out.println(str1.trim());    // Removes the leading and telling spaces

        // Find number of words in a string(not spaces)

        String str3 = "   Amol  Ashok      Chavan           ";
        str3 = str3.replaceAll("\\s+", " ").trim();
        String[] words = str3.split("\\s");      // to use split we need to remove all extra spaces from the string

        System.out.println("Number of words in string : "+words.length);
    }
}
