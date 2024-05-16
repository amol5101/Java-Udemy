import java.lang.*;          // this package contains the String class and its all methods
public class stringClassAndPrinting {

    public static void main(String args[]){

        // Creating the string object using character array
        char c[] = {'A', 'B', 'C', 'D'};
        String str1 = new String(c);           // converting char array to string object

        System.out.println(c);


        // Creating the string object using Byte array
        byte b[] = {65,66,67,68};
        String str2 = new String(b);            // converting byte array to string object

        System.out.println(str2);


        // Creating the string object using String literal
        String str3 = "Java";

        System.out.println(str3);

        String str4 = "Java";      // here we are trying to create the another string object
                                 //   but it is already present in the heap so this reference
                                //    will also point to the same string object in pool.

        System.out.println(str3 == str4);      // checking that both the references are pointing to the same address of string object or not.


        String str5 = new String("Java Program");
        // here for creating string object we are using the new keyword
        // it will create the object in heap memory
        // we know that the here two objects should be created one in heap and another one in pool
        // But here only in heap the object will be created and not in pool
        //  because there in pool the same object is already present.

    }
}
