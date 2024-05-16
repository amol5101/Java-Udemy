package OOP.Inheritance.constructorsInInheritance;

/*
    How to call the parameterized constructor of parent class using object of child class :
    - we can call the parameterized constructor using the super keyword
    - lets see where and how to use super keyword.
 */

class base{
    base(){
        System.out.println("non-parametrized constructor base");
    }
    base(int x){
        System.out.println("parametrized constructor base "+ x);
    }
}

class derived extends base{
    derived(){
        System.out.println("non-parametrized constructor derived");
    }
    derived(int x){
        System.out.println("parametrized constructor 1 derived "+ x);
    }
    derived(int x, int y){
        super(x);       // this super keyword is used to call the parameterized constructor of the super class i.e. base class
        System.out.println("parameterized constructor 2 derived "+ y);
    }
}

public class parameterizedConstructorInInheritance{
    public static void main(String[] args){

        derived objDerived = new derived();     // this will call non-parameterized constructor of base and then derived class's
                                                // non-parameterized constructor

        derived objDerived1 = new derived(10);      // this will call firstly the non-para constructor of base class
                                                        // then parameterized constructor 1 of derived class

        derived objDerived2 = new derived(20,10);
                        // As we have used the super keyword inside of constructor of derived class to call the parameterized
                        // constructor of the base class(super class)
                        // this will call first the parameterized constructor of the base class then the parameterized constructor 2
                        // derived class
    }
}
