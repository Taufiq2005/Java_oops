public class GCExample {

    public void finalize() {
        System.out.println("Object is garbage collected");
    }

    public static void main(String[] args) {

        GCExample obj1 = new GCExample();
        GCExample obj2 = new GCExample();

        obj1 = null;
        obj2 = null;

        System.gc();
    }
    
}
