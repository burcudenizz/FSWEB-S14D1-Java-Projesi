package model;

public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        checkHeight(height);
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        checkHeight(height);
    }

    public void checkHeight(double height) {
        if (this.height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getVolume() {
        return this.getArea() * height;
    }


}
