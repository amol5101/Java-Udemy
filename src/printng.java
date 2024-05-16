public class printng {
    public static void main(String args[]){

        int x = 10, y = 20;
        System.out.println("Sum is "+ x + y);       // This will print "Sum is 1020"
                                                    // i.e. it is taking "+" operator as a concatination operator.

        System.out.println("Sum is "+ (x + y));     // This will print 'Sum is 30'
                                                    // i.e. it is taking first + as concatination and another + for adding those two values.
        
    }
}
