interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Meow");
    }
}

class AnimalFactory {
    public Animal getAnimal(String type) {
        if(type.equals("dog"))
            return new Dog();
        else
            return new Cat();
    }
	
    public static void main(String[] args) {
        Animal a = new AnimalFactory().getAnimal("dog");
        a.sound();
    }
}
