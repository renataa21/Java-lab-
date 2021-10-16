import java.lang.*;
public abstract class Shape {

    protected String color;
    protected boolean filled;

    public Shape(){
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {

        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    abstract double getAria();
    abstract double getParameter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

class Circle extends Shape{

    protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getAria(){
        return this.radius*this.radius*3.14d;
    }

    public double getParameter() {
        return this.radius*2*3.14d;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}


class Rectangle extends Shape{

    protected double length;
    protected double width;

    public Rectangle(){
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getAria(){
        return this.length*this.width/2;
    }

    public double getParameter() {
        return this.width*3;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}

class Square extends Rectangle{

    double site;

    public Square(double site) {
        this.site = site;
    }

    public Square(String color, boolean filled, double site) {
        this.site = site;
        setColor(color);
        setFilled(filled);
    }

    public double getSite() {
        return site;
    }

    public void setSite(double site) {
        this.site = site;
    }

    @Override
    public void setLength(double site) {
        super.setLength(site);
    }

    @Override
    public void setWidth(double site) {
        super.setWidth(site);
    }


    @Override
    public String toString() {
        return "Square{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", site=" + site +
                '}';
    }
}

