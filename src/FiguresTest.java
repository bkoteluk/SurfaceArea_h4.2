public class FiguresTest {
    public static void main(String[] args) {
        Square square = new Square(10);
        Rectangle rectangle = new Rectangle(10, 12);
        Circle circle = new Circle(7.5);
        Triangle triangle = new Triangle(6,8, 10, 8);
//        ShapeCalculator calc = new ShapeCalculator();

        System.out.println(square + " posiada pole o powierzchni = " + square.calculateArea());
        System.out.println(rectangle + " posiada obwód = " + rectangle.calculatePerimeter());
        System.out.println(circle + " posiada polę powierzchni = " + circle.calculateArea());
        System.out.println(triangle + " posiada obwód = " + triangle.calculatePerimeter());

    }
}
