interface Shape {
    double getArea();
}

// Circle class implementing Shape
class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Square class implementing Shape
class Square implements Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

public class Task5 {
    public static void main(String[] args) {
        Shape c = new Circle(3.0);
        Shape s = new Square(4.0);

        System.out.println("Area of Circle: " + c.getArea());
        System.out.println("Area of Square: " + s.getArea());
    }  
}
