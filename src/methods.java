/*

Methods :
    - Methods are the members of a classes which provides functionality for the class.

 */
class method1{
    int multiply(int x, int y){
        return x*y;
    }
}
public class methods {
    static int add( int x, int y){
        return x+y;
    }

    public static void main(String args[]){

        int a = 10, b = 20;
        int c = add(a, b);                  // Non-static method 'add(int, int)' cannot be referenced from a static context
                                // so we need to declare the method as a static to refer it from static main method
                                // if we don't want to make the method static then we need to create the object of that class
                                // in method from which we want to call that method

        // now if I want to call the multiply() method from this static main method then I need to create
        // object of class method1 in this static method

        method1 obj = new method1();        // created the object of method1 class .6
        int x = obj.multiply(a,b);          // calling the multiply() method using object of method1 class obj.

        System.out.println("Addition is : "+ c);

    }
}
