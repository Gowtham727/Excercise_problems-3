class C{
    static  void display()
    {
        System.out.println("this is a static method");
    }
    void print(){
        System.out.println("in method print");
    }

}
class D extends C{
    void print(){
        System.out.println("in method print in subclass");
    }
}
public class Ex8 {
    public static void main(String args[]){
        C c=new D();
        c.print();

    }
}
