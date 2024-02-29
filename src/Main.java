//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Test Circle class
        Circle circle = new Circle(4.0);
        System.out.println("Circle Radius: " + circle.getRadius());
        System.out.printf("Circle Area: %.2f\n", circle.calculateArea());
        System.out.printf("Circle Circumference: %.2f\n", circle.calculateCircumference());

        // Test Rectangle class
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("\nRectangle Height: " + rectangle.getHeight());
        System.out.println("Rectangle Width: " + rectangle.getWidth());
        System.out.printf("Rectangle Area: %.2f\n", rectangle.calculateArea());
        System.out.printf("Rectangle Perimeter: %.2f\n", rectangle.calculateCircumference());

        // Test Triangle class
        Triangle triangle = new Triangle(3.0, 4.0);
        System.out.println("\nTriangle Height: " + triangle.getHeight());
        System.out.println("Triangle Base: " + triangle.getBase());
        System.out.printf("Triangle Area: %.2f\n", triangle.calculateArea());
        System.out.printf("Triangle Perimeter: %.2f\n", triangle.calculateCircumference());
    }





    }
