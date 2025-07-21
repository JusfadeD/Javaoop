public class Task1 {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Alice";
        p.age = 25;
        p.display();
    }
}

class Person {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

