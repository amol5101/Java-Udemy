public class swappingWithoutUsingThirdVariable_UsingBitwiseOperators {
    public static void main(String args[]){

        int a = 9, b = 12;
        System.out.println("Before Swapping : ");
        System.out.println("a = "+a+" b = "+b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swapping : ");
        System.out.println("a = "+a+" b = "+b);
    }
}
