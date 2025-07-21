public class Task2 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.length = 10.0;
        rect.width = 5.0;
        System.out.println("Area of Rectangle: " + rect.calculateArea());
    }
}

class Rectangle {
    double length;
    double width;

    // Method to calculate area
    double calculateArea() {
        return length * width;
    }
}
