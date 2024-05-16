package OOP.Constructor;

class circle{
    private int radius;

    public circle(){            // default constructor
        radius = 1;
    }

    public circle(int r){       // parameterized constructor that calling setter method to set value of radius.
//        radius = r;
        setRadius(r);
    }

    int getRadius(){        // getter method
        return radius;
    }

    void setRadius(int r){      // setter method
        if(r >= 0)
            radius = r;
        else
            radius = 0;
    }

    double areaOfCircle(){
        double area = Math.PI*radius*radius;
        return area;
    }
}

public class rectangle{

    private int length;
    private int breadth;

    public rectangle(){     // default/non-parameterized constructor
        length = 0;
        breadth = 0;
    }

    private rectangle(int l, int b){        // parameterized constructor
        length = l;
        breadth = b;
    }

    public static void main(String args[]){

        rectangle objRectangle1 = new rectangle();       // object of class rectangle created
                                                                // the default constructor will be called

        rectangle objRectangle2 = new rectangle(10,20);       // another object of class rectangle created
                                                        // the parameterized constructor will be called

        circle objCircle1 = new circle();           // object of class circle created which will call default constructor

        circle objCircle2 = new circle(50);         // another object of class circle, as we are providing parameters to its constructor
                                                    // the parameterized constructor will be invoked/ called

        System.out.println("Area of circle 1 is : " + objCircle1.areaOfCircle());
        System.out.println("Area of circle 2 is : " + objCircle2.areaOfCircle());
    }
}
