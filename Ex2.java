class Vehicle{
    protected  void start(){
        System.out.println("vehicle can start");
    }
}
class Car extends  Vehicle{
    public void start()
    {
        System.out.println("car can start");
    }
}
public class Ex2 {
    public static void main(String args[])
    {
        Vehicle vehicle=new Car();
        vehicle.start();
    }
}
