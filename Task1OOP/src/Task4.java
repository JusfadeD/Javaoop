// Task4.java
public class Task4 {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Create Dog object as Animal reference
        myDog.sound();            // Calls overridden method
    }
}

class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

// Subclass overriding the method
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
