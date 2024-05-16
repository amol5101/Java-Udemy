
import java.util.*;

class check{
    void chk(int a){
        if(a%2==0){
            System.out.println(a + " is Even Number.");
        }
        else{
            System.out.println(a + " is Odd Number.");
        }
    }
}
public class EvenOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        check obj = new check();
        obj.chk(n);

//        if(n%2==0){
//            System.out.println(n + " is Even Number.");
//        }
//        else{
//            System.out.println(n + " is Odd Number.");
//        }
    }
}
