import java.lang.reflect.Constructor;

class Singleton1{

    private static Singleton1 obj = new Singleton1();

    private Singleton1() {
        System.out.println("Constructor Called");
    }

    public static Singleton1 getInstance() {
        return obj;
    }

 public static void main(String[] args) throws Exception {

        Singleton1 s1 = Singleton1.getInstance();

        // Break singleton using reflection
        Constructor<Singleton1> c = Singleton1.class.getDeclaredConstructor();
        c.setAccessible(true);

        Singleton1 s2 = c.newInstance();

        System.out.println(s1);
        System.out.println(s2);
    }
}