// Shape class
class Shape {
    // draw method
    void draw() {
        System.out.println("Drawing a generic shape");
    }
}

// Circle class inheriting from Shape class
class Circle extends Shape {
    // Overriding draw method for Circle
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Polygon class inheriting from Shape class
class Polygon extends Shape {
    // Overriding draw method for Polygon
    @Override
    void draw() {
        System.out.println("Drawing a polygon");
    }
}

// Rectangle class inheriting from Shape class
class Rectangle extends Shape {
    // Overriding draw method for Rectangle
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// ShapeDemo class
public class main {
    public static void main(String[] args) {
        // Creating a reference to Shape class referring to Circle subclass
        Shape shapeRef = new Circle();
        
        // Calling draw() using the reference
        shapeRef.draw(); // Output: Drawing a circle
        
        // Creating a reference to Shape class referring to Polygon subclass
        shapeRef = new Polygon();
        
        // Calling draw() using the reference
        shapeRef.draw(); // Output: Drawing a polygon
        
        // Creating a reference to Shape class referring to Rectangle subclass
        shapeRef = new Rectangle();
        
        // Calling draw() using the reference
        shapeRef.draw(); // Output: Drawing a rectangle
    }
}
