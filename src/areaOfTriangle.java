import java.util.*;
public class areaOfTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // when the height and base is given.
//        System.out.println("Enter the height : ");
//        int h = sc.nextInt();
//        System.out.println("Enter the base : ");
//        int b = sc.nextInt();
//        System.out.println("Area of Tirangle is : ");
//        System.out.println(0.5*(b*h));

        // When all sides are given.

        System.out.println("Enter sides of triangle : ");
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();

        float s = (a+b+c)/2;

        System.out.println("The area of triangle is : "+ Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
}
