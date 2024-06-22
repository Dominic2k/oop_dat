package CLASSES;

public class LineSub extends Point{
    private Point end;

    public LineSub (int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }
    public LineSub (Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    public String toString() {
        return "Line make from " + super.toString() + " and " + this.end;
    }
   
    // public Point getBegin();
    public Point getEnd() {
        return this.end;
    }
    public void setBegin(Point begin) {
        // this.begin = begin;
    }
    public void setEnd(Point end) {
        this.end = end;
    }
   
    // public int getBeginX() {
    //     return this.begin.getX();
    // }
    // public int getBeginY() {
        // return this.begin.getY();
    // }
    public int getEndX() {
        return this.end.getX();
    }
    public int getEndY() {
        return this.end.getY();
    }
   
    // public void setBeginX(int x) {
    //     this.begin.setX(x);
    // }
    // public void setBeginY(int y) {
    //     this.begin.setY(y);
    // }
    // public void setBeginXY(int x, int y) {
    //     this.begin.setXY(x, y);
    // }
    public void setEndX(int x) {
        this.end.setX(x);
    }
    public void setEndY(int y) {
        this.end.setY(y);
    }
    public void setEndXY(int x, int y) {
        this.end.setXY(x, y);
    }
   
    // public int getLength() {
    //     return (int)Math.sqrt((this.end.getX()-this.begin.getX())*(this.end.getX()-this.begin.getX()) + (this.end.getY()-this.begin.getY())*(this.end.getY()-this.begin.getY()));
    // }
    // public double getGradient() {
    //     return Math.atan2(this.end.getY()-this.begin.getY(), this.end.getX()-this.begin.getX());
    // }


}
