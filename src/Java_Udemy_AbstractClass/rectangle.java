package Java_Udemy_AbstractClass;

public class rectangle extends shape{

    protected double length;
    protected double breadth;

    @Override
    public double perimeter() {
        return 2 * (length + breadth);
    }

    @Override
    public double area() {
        return length * breadth;
    }


}
