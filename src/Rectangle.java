public class Rectangle {
    double sideA;
    double sideB;

    Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String toString() {
        return "Prostokąt o bokach: a = " + sideA + ", b = " + sideB + " ";
    }
}
