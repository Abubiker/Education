package Lesson7.Shape;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Triangle(3, 4, 5, 4, 3);
        shapes[1] = new Rectangle(5, 7);
        shapes[2] = new Circle(2);
        shapes[3] = new Triangle(6, 8, 10, 8, 6);
        shapes[4] = new Rectangle(3, 9);

        double totalPerimeter = 0;

        for (Shape shape : shapes) {
            totalPerimeter += shape.calculatePerimeter();
        }

        System.out.println("Сумма периметров всех фигур: " + totalPerimeter);
    }
}
