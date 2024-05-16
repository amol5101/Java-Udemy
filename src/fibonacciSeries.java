import java.util.*;
public class fibonacciSeries {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        int temp, a = 0, b = 1;

        if(n>=0)
            System.out.println(0);
        if(n>=1)
            System.out.println(1);

        for(int i = 0; i < (n-2); i++){
            temp = a+b;
            a = b;
            b = temp;
            System.out.println(temp);
        }
    }
}