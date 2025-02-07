abstract class Shape1{
    abstract void area();
}
class Circle1 extends Shape1{
    @Override
    void area() {
        int r=2;
        System.out.println("the area of the circle is "+Math.PI*r*r);
    }
}
class Rectangle1 extends  Shape1{
    void area(){
        int l,b,h;
        l=2;
        b=3;
        h=4;
        System.out.println("the area of the rectangle is "+l*b*h);
    }
}
class Allow{
    void permit(Shape1 obj)
    {
        obj.area();
    }
}
public class Ex3 {
    public static  void main(String args[])
    {
        Circle1 circle=new Circle1();
        Rectangle1 rectangle =new Rectangle1();
        Allow allow=new Allow();
        allow.permit(circle);
        allow.permit(rectangle);


    }
}
