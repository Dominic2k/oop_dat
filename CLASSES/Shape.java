package CLASSES;

public class Shape {
    protected String color = "red";
    protected boolean filled = true;

    public Shape(){
        
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return this.filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    //"A Shape with color of xxx and filled/Not filled"

    public String toString(){
        String fill = "Filled";
        if (this.filled == false) {
            fill = "Not filled";
        }
        return "A shape with color of " + this.color + " and " + fill;
    }
}
