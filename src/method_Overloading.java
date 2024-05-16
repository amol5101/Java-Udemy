/*

Method Overloading :

- Method overloading means writing more than one method having same names but different parameter list or data types.
- Compiler will call the corresponding method depending upon the parameter list.

 */


public class method_Overloading {

    int max(int x, int y){
        return x > y ? x : y;
    }
    float max(float x, float y){
        return x > y ? x : y;
    }
    int max(int x, int y, int z){
        return x > y && x > z ? x : (y > z ? y : z);
    }

    public static void main(String args[]){

        method_Overloading obj = new method_Overloading();

        System.out.println(obj.max(4,5));    //  compiler will call max function which is accepting two integer parameters

        System.out.println(obj.max(4,5, 10));   // compiler will call max function which is accepting three integer parameters

        System.out.println(obj.max(4f,5f));   // compiler will call max function which is accepting two float parameters

        // suggested debug this program for better understanding.

    }
}
