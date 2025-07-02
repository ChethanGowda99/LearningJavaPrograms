package Task_july02;

class Animal {
    void makeSound() {
        System.out.println("Parent Cat");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Child Cat");
    }
}

public class Animal_sound_simulator {
    public static void main(String[] args) {
        // Object creation of Cat
        Cat c1 = new Cat();
        c1.makeSound(); // Inherited from Animal
        c1.meow();      // Specific to Cat
    }
}
