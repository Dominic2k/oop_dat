package CLASSES;

public class CircleInheritance extends Shape{
    private double radius = 1.0;

    public CircleInheritance(){
    }
    public CircleInheritance(double radius){
        this.radius = radius;
    }
    public CircleInheritance(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
    public double getPerimeter(){
        return this.radius * 2 * Math.PI; 
    }
//"A Circle with radius=xxx, which is a subclass of yyy"
    public String toString(){
        return "A Circle with radius = " + this.radius +", which is a subclass of " + super.toString();
    }
}
