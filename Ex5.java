class Animal{
    void sound()
    {
        System.out.println("animal makes sound....");
    }
}
class Dog extends  Animal{
    void sound()
    {
        System.out.println("dog barks...");
    }

}
class Cat extends  Animal{
    void sound()
    {
        System.out.println("cat meows...");
    }
}
class Demo{
    void makesound(Animal animal)
    {
        animal.sound();
    }
}
public class Ex5 {
    public static void main(String args[])
    {
        Animal animal=new Animal();
        Dog dog=new Dog();
        Cat cat=new Cat();
        Demo demo=new Demo();
        demo.makesound(animal);
        demo.makesound(dog);
        demo.makesound(cat);


    }
}
