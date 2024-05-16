package OOP.Inheritance.constructorsInInheritance;

/* Constructor in Inheritance :
    - constructor gets automatically called when an object of that class is created
    - In inheritance the constructors gets called from top class to bottom class
    - To make the constructor of child clas we must need to create the constructor of the parent class
*/

class parent{
    parent(){
        System.out.println("Parent Constructor");
    }
}

class child extends parent{
    child(){
        System.out.println("Child Constructor");
    }
}

class grandchild extends child{
    grandchild(){
        System.out.println("Grand Child Constructor");
    }
}

public class constructorInInheritance {
    public static void main(String[] args){

        child obj1 = new child();
        grandchild obj2 = new grandchild();
    }
}

/*
    - If we see this example, the child class is inherited from parent class and grandchild class is inherited from the child class
    - when we created the object of the child class, firstly the constructor of the parent class is called and then child class is called
    - when we created the object of grandchild class, firstly the constructor of the top class which is parent class is excuted
        and then the child class and then finally the grandchild class constructor is called.
    - from that we get to know that the constructors in inheritance gets called from the top class to the lower class, level by level.
 */











