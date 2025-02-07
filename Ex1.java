import java.awt.*;

abstract class Shape{
    abstract void area();

}
class Circle extends  Shape{
    @Override
    void area() {
        System.out.println("the area of the circle is "+Math.PI*2*2);

    }
}
class Rectangle extends Shape{
    @Override
    void area() {
        System.out.println("the area of the triangle is "+ 2*3*4);
    }
}
public class Ex1 {
    public static void main(String args[])
    {
        Circle circle=new Circle();
        circle.area();
        Rectangle rectangle=new Rectangle();
        rectangle.area();
    }
}
