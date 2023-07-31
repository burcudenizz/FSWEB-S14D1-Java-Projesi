package model;

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double length, double width) {
        checkLength(length);
        checkWidth(width);
    }

    public void checkLength(double length) {
        if (this.length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public void checkWidth(double width) {
        if (this.width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.length * this.width;
    }


}
