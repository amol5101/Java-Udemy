import java.sql.SQLOutput;
import java.util.*;
class find{
    int PON(int n){
        int flag=0;
        for(int i = 2; i<n; i++){
            if(n%i==0){
                flag++;
                break;
            }
        }
        return flag;
    }
}
public class PrimeOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        find obj = new find();
        if(obj.PON(num)==1){
            System.out.println(num +" is not a Prime number.");
        }
        else{
            System.out.println(num +" is a Prime number.");
        }
    }
}
