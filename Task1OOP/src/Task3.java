// Task3.java
public class Task3 {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell", 150);
        Book b2 = new Book("Animal Farm", "George Orwell");

        b1.displayInfo();
        b2.displayInfo();
    }
}

class Book {
    String title;
    String author;
    double price;

    // Constructor with all three parameters
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Constructor with default price = 100
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 100;
    }

    // Method to display book info
    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}
