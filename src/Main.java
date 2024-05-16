
import  java.lang.*;
import java.util.*;
public class Main {
    public static void main(String[] args){
//        String name = "Amol";
//        System.out.println(name);
//
//        int a = 1, b = 2, c = 3;
////        float flt = 44.225;     // error
//        float flt = 44.225f;    // correct way to declare and store the floating point value
//        boolean isAdult = true;
//
//        System.out.println(b+c);
//        System.out.println(flt);
//        System.out.println(isAdult);


        // taking input from user / keyboard
        Scanner s = new Scanner(System.in);

//        System.out.println("Enter First Name : ");
//        String FName = s.next();

//        System.out.println("Enter Last Name : ");
//        String LName = s.next();

//        System.out.println("Enter Roll No. : ");
//        int RNo = s.nextInt();

//        System.out.println("Enter something about yourself : ");
//        String sentence = s.nextLine();

//        System.out.println("Enter BE Percentage : ");
//        float result = s.nextFloat();

//        System.out.println(FName);
//        System.out.println(LName);
//        System.out.println(RNo);
//        System.out.println(sentence);
//        System.out.println(result);


        String name = "Amol";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name + " Ashok" + " Chavan");

        System.out.println("My name is Amol\\.");   // escape sequence operator /
        System.out.println("My name is Amol\".");   // escape sequence operator /
        System.out.println("My name is Amol\t." + "Hello");   // escape sequence operator /
        System.out.println("My name is Amol\n." + "Hello");   // escape sequence operator /
        System.out.println("My name is Amol.");

        System.out.println(name.contains("ol"));        // does string contains this
        System.out.println(name.contains("al"));

        System.out.println(name.charAt(3));             // what is at 3 index  (index always starts with 0)

        System.out.println(name.endsWith("ol"));        // does string ends with or not
        System.out.println(name.startsWith("Am"));      // does string starts with or not

        System.out.println(name.indexOf("ol"));         // returns index of the given character
        System.out.println(name.indexOf("ml"));         // if not present then returns -1


        // Math class in java

        int a = 10, b = 20;
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));
        System.out.println(Math.abs(-36));
        System.out.println(Math.sqrt(36));
        System.out.println(Math.random());      // this will return random value between 0 and 1


        // If-else Statement

//        System.out.println("Enter your age : ");
//        int age = s.nextInt();
//
//        if(age <= 0)
//            System.out.println("You are not even Born😂");
//
//        else if (age < 10)
//            System.out.println("You are a kid.");
//
//        else if(age > 10 && age <=18)
//            System.out.println("You are a Teenager.");
//
//        else if (age > 18 && age <35)
//            System.out.println("You are Middle Aged.");
//
//        else
//            System.out.println("You are Senior Citizen.");


        // Switch Statement

//        switch (age){
//            case 10:
//                System.out.println("You are a kid.");
//                break;
//
//            case 15:
//                System.out.println("You are a Teenager.");
//                break;
//
//            case 30:
//                System.out.println("You are Middle aged.");
//                break;
//
//            default:
//                System.out.println("You are Senior Citizen.");
//        }



        // Array in java

//        int array[] = {1, 2, 3, 4, 5};
//
//        for(int i = 0; i<array.length; i++){
//            System.out.print(array[i]);
//        }

        System.out.println("Enter the size of array : ");
        int n = s.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }


        Arrays.sort(arr);
        System.out.println("Sorted array is : ");
        for(int i = 0; i < n; i++){
        System.out.print(arr[i]+"\n");
        }
    }
}