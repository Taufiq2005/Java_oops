import java.io.*;

class Emp4 implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int id = 101;
    transient String password = "abc123";

  public static void main(String[] args) throws Exception {

        Emp4 e1 = new Emp4();

        try (// Serialization
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.txt"))) {
			oos.writeObject(e1);
		}
                
        try (// Deserialization
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.txt"))) {
			Emp4 e2 = (Emp4) ois.readObject();

			System.out.println(e2.id);
			System.out.println(e2.password);
		}
    }
}