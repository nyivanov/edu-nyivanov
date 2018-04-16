package alg;

/**
 * Description:
 * Singleton class means you can create only one object for the given class.
 * You can create a singleton class by making its constructor as private, so that you can restrict the creation of the object.
 * Provide a static method to get instance of the object, wherein you can handle the object creation inside the class only.
 */
public final class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }
}
