public class regularExpression_quantifiers {
    public static void main(String[] args){

        String str = "abcdef";
        String str1 = "a1b2c3d4e5f6";


        System.out.println(str.matches(".*"));  // This will allow any letter or any number or any symbol any no of times else it is false

        System.out.println(str1.matches("[a-z]*"));     // This will allow any letter from a to z any number of times
                                                            // if in the string other than a to z present then it will return false

//        System.out.println("");

    }
}
