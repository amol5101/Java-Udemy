package OOP.Inheritance.constructorsInInheritance;

/*
    super keyword :
    - The super keyword in Java is a reference variable that is used to refer to parent class when we’re working with objects.

    - Use of super keyword in Java : It is majorly used in the following contexts as mentioned below:
            1. Use of super with Variables
            2. Use of super with Methods
            3. Use of super with Constructors

    - Characteristics of Super Keyword :
        1. super is used to call a superclass constructor: When a subclass is created, its constructor must call the constructor
                of its parent class. This is done using the super() keyword, which calls the constructor of the parent class.

        2. super is used to call a superclass method: A subclass can call a method defined in its parent class using the super keyword.
                This is useful when the subclass wants to invoke the parent class’s implementation of the method in addition to its own.

        3. super is used to access a superclass field: A subclass can access a field defined in its parent class using the super keyword.
                This is useful when the subclass wants to reference the parent class’s version of a field.

        4. super must be the first statement in a constructor: When calling a superclass constructor, the super() statement must be
                the first statement in the constructor of the subclass.

        5. super cannot be used in a static context: The super keyword cannot be used in a static context, such as in a static method
                or a static variable initializer.

        6. super is not required to call a superclass method: While it is possible to use the super keyword to call a method in the
                parent class, it is not required. If a method is not overridden in the subclass, then calling it without the super keyword
                will invoke the parent class’s implementation.
 */


import javax.swing.plaf.IconUIResource;

class Rectangle{
    int length;
    int breadth;
    int x = 10;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    double areaRectangle(){
        return this.length * this.breadth;
    }
}

class cuboid extends Rectangle{
    int height;
    int x = 20;

    cuboid(int l, int b, int height){
        super(l, b);        // here we have used super keyword to call the parameterized constructor of the super class
        this.height = height;
    }

    void display(){
        System.out.println("Rectangle x : " + super.x);     // here we used super keyword to refer x of the super class(Rectangle)
        System.out.println("Cuboid x : " + x);
    }
    void surfaceAreaOfCuboid(){
        System.out.println("surface area of cuboid is : " + super.areaRectangle());     // here we used super keyword to call the method of super class i.e. rectangle class
    }
}

public class superKeyword {
    public static void main(String[] args){

        cuboid c1 = new cuboid(1,2,3);
    }
}

// if this is not executing here try with the other online compilers
