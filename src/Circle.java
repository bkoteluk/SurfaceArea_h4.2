public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Koło o promieniu " + radius + " ";
    }
}
