//Child class
public class ChildClass extends Parent1{
    int age;
    //performing overriding
    @Override
    void showMessage()
    {
        System.out.println("Child method is called");
    }
    public static void writeData() {
        System.out.println("write method of child class");
    }
}