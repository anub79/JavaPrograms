package JavaConcepts;

public class SingletonPattern {
    private SingletonPattern() {
        System.out.println("In private constructor");
    }

    private static SingletonPattern ref;

    public static SingletonPattern getReference() {
        if (ref == null)
            ref = new SingletonPattern();


        return ref;



    }
}