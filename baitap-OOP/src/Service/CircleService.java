package Service;

import Modal.Circle;

public class CircleService {
    private Circle circle = new Circle();

    final double PI = 3.14;
    public double getAria(double radius) {
        return PI * Math.pow(radius,2);
    }

    public double getPerimeter(double radius) {
        return 2 * PI * radius;
    }
}
