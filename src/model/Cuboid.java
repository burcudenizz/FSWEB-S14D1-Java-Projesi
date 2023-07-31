package model;

public class Cuboid extends Rectangle {

    private double height;


    public Cuboid(double height, double length, double width) {
        super(length, width);
        checkHeight(height);
    }

    public void checkHeight(double height) {
        if (this.height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.getArea() * height;
    }
}
