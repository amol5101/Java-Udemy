public class bitwiseDemo {
    public static void main(String args[]){

        // Bitwise Operators :
        //int x = 10, y = 6, z;
        int x = 0b1010, y = 0b110, z;       // we can also store the decimal number in integer type of variable
                                            // in the form of binary number.

        // AND (&)
        z = x&y;                            // T,T -> T (Otherwise F)
        System.out.println(z);

        // OR (|)
        z = x | y;                          // F,F -> F (Otherwise T)
        System.out.println(z);

        // XOR (^)
        z = x ^ y;                          // T,T -> F and F,F -> F (Otherwise T)
        System.out.println(z);

        // LEFT SHIFT (<<)
        z = x<<1;                           // n<<k -> n*2(power)k
        System.out.println(z);

        // RIGHT SHIFT (>>)
        z = x>>1;                           // n>>k -> n/2(power)k
        System.out.println(z);
    }
}
