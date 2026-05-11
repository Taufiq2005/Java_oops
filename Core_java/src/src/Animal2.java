abstract class Animal2 {

    private String name = "Dog";

    public String getName() {
        return name;
    }

    abstract void sound();
}

class Dog2 extends Animal2 {

    @Override
    void sound() {
    	
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {

        Dog2 d = new Dog2();

        System.out.println("Name: " + d.getName());

        d.sound();
        
    }
}