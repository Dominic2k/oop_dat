package CLASSES;

public class Rectangle extends Shape{
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle(){
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return this.width;
    }
    public double getLength(){
        return this.length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        return this.width * this.length;
    }
    public double getPerimeter(){
        return 2 * (this.width + this.length);
    }

    //"A Rectangle with width=xxx and length=zzz, which is a subclass of yyy"
    public String toString(){
        return "A Rectangle with width = " + this.width + " and length = " + this.length + ", which is a subclass of " + super.toString();
    } 
    

}
