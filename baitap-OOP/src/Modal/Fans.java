package Modal;

public class Fans {
    private int speed;
    private boolean status;
    private double radius;
    private String color;

    public Fans() {
    }

    public Fans(int speed, boolean status, double radius, String color) {
        this.speed = speed;
        this.status = status;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (status) {
            return "[ Speed: " + speed + " | Radius: " + radius + " | Color: " + color + " and fans is on]";
        } else {
            return "[ Radius: " + radius + " | Color: " + color + " and fans is off]";
        }
    }
}
