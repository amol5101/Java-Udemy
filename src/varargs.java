/*

Variable Arguments (varargs) :

➢ It is nothing but writing a single method which can run for number of parameters of same data types.
➢ For example	– void show(int ...x)
   Where ... represents the	variable arguments.
➢ It is similar to ellipsis in c/c++.
➢ The parameters passed are converted into an array.
➢ The parameters can be directly passed using an anonymous array.
➢ Variable argument should always be the	last parameter.
➢ Printf is based on variable arguments in version	1.7	java.

- Using varargs we can use the single method for any numbers of arguments we pass
- the parameters we are passed are converted into an array

 */



public class varargs {

    static void show(int ...a){         // here I have declared this method as static because, i dont want to create object to call this method in main method

        for (int x : a){
            System.out.println(x+ " ");
        }
    }

    // passing string as a varargs

    static void showList(String ...str){
        for(String y : str){
            System.out.println(y);
        }
    }
// git
    public static void main(String ...args){

        show();
        show(1);
        show(1,2,3,4,5);        // these arguments are being converted into an array.
        show(new int[]{2,4,6,8,10,12,14,16,18,20});     // we can pass anonymous array also

        showList();
        showList("Amol", "Shubham", "Tushar", "Mayur", "Soham");

        int amol = 1000;
        System.out.println(amol);

    }
}