public class ShapeCalculator {

    double squareArea(Square square) {

        return square.side*square.side;
    }

    double circleArea(Circle circle) {

        return circle.radius*circle.radius*Math.PI;
    }

    double trianglePerimeter(Triangle triangle) {

        return triangle.sideA + triangle.sideB + triangle.sideC;
    }

    double rectPerimeter(Rectangle rectangle) {

        return 2*rectangle.sideA + 2*rectangle.sideB;
    }
}
