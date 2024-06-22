package CLASSES;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint(){
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void SetX(int x){
        this.x = x;
    }
    public void SetY(int y){
        this.y = y;
    }
    public void SetXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "Position x: " + x + "\nPosition y: " + y;
    }

    public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance(MyPoint anotherPoint){
        int xDiff = this.x - anotherPoint.x;
        int yDiff = this.y - anotherPoint.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    
}
