abstract  class Person{
    Person(String name,int age){
        System.out.println("name "+name + " age ," +age);
    }

}
class Student extends Person{
    Student(String name, int age ,int grade) {
        super("raj",12);
        System.out.println("the name is "+name + " the age is "+age +" the grade is "+grade );

    }
}
public class Ex6 {
    public static void main(String args[])
    {
        Person person=new Student("ramesh",23,1);
    }
}
