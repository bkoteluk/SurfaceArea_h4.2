public class Triangle {
    double sideA;
    double sideB;
    double sideC;
    double height;

    Triangle(double sideA, double sideB, double sideC, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    public String toString() {
        return "Trójkąt o bokach: a = " + sideA + ", b = " + sideB + ", c = " + sideC + " oraz wysokości h = " + height;
    }

    double calculatePerimeter() {

        return sideA + sideB + sideC;
    }
}
