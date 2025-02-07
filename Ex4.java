class A{
    void display()
    {
        System.out.println("in class A");
    }
}
class B extends A{
    void display()
    {
        super.display();
        System.out.println("in class B");
    }
}
public class Ex4 {
    public static void main(String args[])
    {
        A a=new B();
        a.display();
    }
}
