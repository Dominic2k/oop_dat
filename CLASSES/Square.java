package CLASSES;

public class Square extends Rectangle{

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side,color,filled);
    }

    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    public void setLength(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    public double getArea(){
        return super.getLength() * super.getWidth();
    }
    public double getPerimeter(){
        return super.getLength() * 4;
    }

    // "A Square with side=xxx, which is a subclass of yyy"
    public String toString(){
        return "A Square with side = " + super.getWidth() + ", which is a subclass of " + super.toString();
    }
}
