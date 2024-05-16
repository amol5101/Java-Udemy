/*

Passing an object as a parameter :
    - When the method is called the value of actual parameters are copied in formal parameters
      which is the only parameter passing method in java.

    - here in this program we are passing the array object to the method to update the particular element at an index
      the reference A[] is being passed, so the value of reference (i.e. the address of object it storing) will be
      copied to the formal parameter X[].
    - now A[] & X[] both are pointing (referencing) to the same location, so if we update some element in array object using X[]
      then it will update the actual object.

 */

public class passingObjectAs_AParameter {

    void update(int X[]){
        X[2] = 10;
    }

    String userName(String email){

        return email.substring(0, email.indexOf('@'));
    }

    public static void main(String args[]){

        // passing array object as a parameter
        int A[] = {1,2,3,4,5};

        System.out.println("Before update : "+ A[2]);

        passingObjectAs_AParameter obj = new passingObjectAs_AParameter();      // object created of a class
        obj.update(A);      // passing object as a parameter to the update() method.

        System.out.println("After update : "+ A[2]);       // displaying updated element of an array


        // passing string object as a parameter
        String id = "amolchavan@gmail.com";

        passingObjectAs_AParameter obj2 = new passingObjectAs_AParameter();
        System.out.println("Username is : " + obj2.userName(id));

    }
}
