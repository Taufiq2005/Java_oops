import java.io.*;

class Singleton2 implements Serializable {

	private static Singleton2 obj = new Singleton2();

    private Singleton2() { }

    public static Singleton2 getInstance() {
        return obj;
    }

    protected Object readResolve() {
        return obj;
    }

 public static void main(String[] args) throws Exception {

        Singleton2 s1 = Singleton2.getInstance();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.txt"))) {
			oos.writeObject(s1);
		}     
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.txt"))) {
			Singleton2 s2 = (Singleton2) ois.readObject();

			System.out.println(s1);
			System.out.println(s2);
		}
    }
}