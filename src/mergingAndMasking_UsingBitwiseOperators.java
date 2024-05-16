public class mergingAndMasking_UsingBitwiseOperators {
    public static void main(String args[]){

        // Merging
        // of two values in single byte variable
        byte a = 9, b = 12;
//        byte a = 0b1001, b = 0b1100;
        byte c;

        c = (byte)(a<<4);
        c = (byte)(c|b);

        System.out.println((c&0b11110000)>>4);
        System.out.println(c&0b00001111);


    }
}
