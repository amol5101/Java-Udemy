import java.util.Scanner;
public class areaOfCuboid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length, Breadth and Height : ");
        float l = sc.nextInt();
        float b = sc.nextInt();
        float h = sc.nextInt();

        float right_left = 2 * b * h;
        float front_back = 2 * l * h;
        float ground_top = 2 * b * l;

        System.out.println("Area of Cuboid is : "+(right_left+front_back+ground_top));
        System.out.println("Volume of the Cuboid is : "+l*b*h);

    }
}
