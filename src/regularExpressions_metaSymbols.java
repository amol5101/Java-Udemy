public class regularExpressions_metaSymbols {
    public static void main(String[] args){

        String str = "5";
        String str1 = " ";

        System.out.println(str.matches("\\d"));     // digit or not, if it is digit then true
        System.out.println(str.matches("\\D"));     // should not be digit then true else false
        System.out.println(str1.matches("\\s"));    // Space or not, if yes then true else false
        System.out.println(str1.matches("\\S"));    // Should not be space, then only true else false
        System.out.println(str.matches("\\w"));     // should be alphabet or digit, then only true
        System.out.println(str.matches("\\W"));     // Neither alphabet nor digit should present, then only true else false



    }
}
