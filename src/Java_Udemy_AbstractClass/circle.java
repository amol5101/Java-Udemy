package Java_Udemy_AbstractClass;

public class circle extends shape{

    protected double radius;

    @Override
    public double perimeter() {
        return 2* Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
