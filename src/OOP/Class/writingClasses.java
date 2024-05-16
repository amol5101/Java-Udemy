package OOP.Class;      // this is just for created folder, this idiot IDE is considering
// it as package, so thats why I need to include this here, so ignore this


// 1. Circle

class circle{

    double radius;              // This is data member, and it is the property of circle

    public double area_circle(){      // This is the method to get the area of circle

        return Math.PI*radius*radius;
    }

    public double perimeter_circle(){      // This is the method to get the perimeter of the circle

        return 2*Math.PI*radius;
    }
}



// 2. Rectangle
class rectangle{

    double length;
    double breadth;

    double area_rectangle(){
        return length*breadth;
    }

    double perimeter_rectangle(){
        return 2*length*breadth;
    }

    boolean isSquare(){
        if(length == breadth)
            return true;
        else
            return false;
    }
}


// 3. Cylinder
class cylinder{

    double radius;
    double height;

    double lid_area_cylinder(){
        return Math.PI * radius * radius;
    }

    double surface_area_cylinder(){
        return 2*Math.PI * radius * height;
    }

    double volume_Cylinder(){
        return Math.PI * radius * radius * height;
    }
}


// 4. Student
class student{

    int roll_no;
    String name;
    float m1, m2, m3;

    double total_marks(){
        return m1+m2+m3;
    }

    double average_marks(){
        return (m1+m2+m3)/3;
    }
}


// 5. Account
class account{

    int accNo;
    String accHolderName;
    float amt = 1000000;

    float show_balance(){
        return amt;
    }
}



// public class
public class writingClasses {
    public static void main(String args[]){

        /* class circle */        System.out.println("\ncircle:");

        circle obj_circle = new circle();     // object of class circle

        obj_circle.radius = 10;         // assigning value of radius to the radius variable using object of class circle
        System.out.println(obj_circle.area_circle());             // calling area_circle method using object of the class circle
        System.out.println(obj_circle.perimeter_circle());        // calling perimeter_circle method using object of the class circle


        /* class rectangle */        System.out.println("\nrectangle :");

        rectangle obj_rectangle = new rectangle();      // object of clas rectangle

        obj_rectangle.length = 10;
        obj_rectangle.breadth = 20;

        System.out.println(obj_rectangle.area_rectangle());
        System.out.println(obj_rectangle.perimeter_rectangle());
        System.out.println(obj_rectangle.isSquare());


        /* class cylinder */        System.out.println("\nCylinder :");

        cylinder obj_cylinder = new cylinder();

        obj_cylinder.radius = 10;
        obj_cylinder.height = 20;

        System.out.println(obj_cylinder.lid_area_cylinder());
        System.out.println(obj_cylinder.surface_area_cylinder());
        System.out.println(obj_cylinder.volume_Cylinder());


        /* class Student */        System.out.println("\nStudent class :");

        student obj_student = new student();

        obj_student.roll_no = 20;
        obj_student.name = "Amol Ashok Chavan";
        obj_student.m1 = 90;
        obj_student.m2 = 85;
        obj_student.m3 = 80;

        System.out.println(obj_student.total_marks());
        System.out.println(obj_student.average_marks());


        /* class Account */        System.out.println("\nAccount :");

        account obj_amount = new account();

        obj_amount.accNo = 5101;
        obj_amount.accHolderName = "Amol Chavan";

        System.out.println(obj_amount.show_balance());




    }
}
