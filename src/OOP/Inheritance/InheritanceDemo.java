package OOP.Inheritance;

class circle{
    // properties
    private double radius;

    // constructors
    circle(){
        radius = 0;
    }
    circle(int radius){
        setRadius(radius);
    }

    // getter method
    double getRadius(){return radius;}

//    setter method
    void setRadius(double r){
        radius = r;
    }

    // methods
    double area(){
        return Math.PI*radius*radius;
    }
    double perimeter(){
        return 2*Math.PI*radius;
    }
}

class cylinder extends circle{
    // properties
    private double height;

    // constructors
    cylinder(){
        height = 0;
    }
    cylinder(int radius, int height){
        setRadius(radius);
        setHeight(height);
    }

    // getter method
    double getHeight(){return height;}

//    setter method
    void setHeight(double h){
        height = h;
    }
    double volume(){
//        return Math.PI*radius*radius*height;      // we cannot access directly the private property of parent class,
                                                    // but we have the properties and methods of it
        return area()*height;
    }
}

public class InheritanceDemo {
    public static void main(String[] args){

        cylinder cylinder1 = new cylinder(10,20);
        System.out.println("Volume : " + cylinder1.volume());     // by calling this function, the cylinder is calling the area method which is in circle

//        circle circle1 = new circle(20);
        System.out.println("Area : " + cylinder1.area());       // here see that we are calling area method using object of cylinder class
                                                                // it is because of inheritance, the cylinder class is borrowing all the properties and methods of circle class


    }
}





