package model;

public class Circle {

    //instance variable
    private double radius;

    //constructor
    public Circle(double radius) {
        checkRadius(radius);
    }

    //getter & setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        checkRadius(radius);
    }

    public void checkRadius(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }


    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }


}
