package OOP.Inheritance.constructorsInInheritance;

/*
    this Keyword :
    - this keyword is used to refer the current object
    - In Java, ‘this’ is a reference variable that refers to the current object,
      or can be said “this” in Java is a keyword that refers to the current object instance.
      It can be used to call current class methods and fields, to pass an instance of the current class as a parameter,
      and to differentiate between the local and instance variables.
      Using “this” reference can improve code readability and reduce naming conflicts.

    - it mostly helps in the case where, we name the local variable same as the instance variable, there the problem arises
      because, when constructor accepts int length and assigning it to the instance variable ( length = length )
      the compiler will not able to identify that we are trying to assign the value of local variable to the instance one.
      So we can use this keyword to clear that which is instance variable ( this.length = length ) so the compiler will
      assign local variable value to the instance variable.
 */

class rectangle{
    int length;
    int breadth;

//    rectangle(int l , int b){       // in this case this keyword is not needed because the local variable names are
//                                    // are different from instance variable
//        length = l;
//        breadth = b;
//    }

    rectangle (int length, int breadth){    // here we needed this keyword to distinguish between local and instance variable.
                                            // because here the both local and instance variable name are same.
        this.length = length;
        this.breadth = breadth;
    }

    void display(){
        System.out.println("Length : " + this.length);
        System.out.println("Breadth : " + this.breadth);
    }
}

public class thisKeyword {
    public static void main(String args[]) {

        rectangle r1 = new rectangle(10, 20);
        r1.display();

        rectangle r2 = new rectangle(5, 10);
        r2.display();
    }
}
