package CLASSES;

public class MyTriangle {
    private MyPoint vertice1;
    private MyPoint vertice2;
    private MyPoint vertice3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.vertice1 = new MyPoint(x1, y1);
        this.vertice2 = new MyPoint(x2, y2);
        this.vertice3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint vertice1, MyPoint vertice2, MyPoint vertice3){
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }

    //"Triangle @ (x1, y1), (x2, y2), (x3, y3)".
    public String toString(){
        return "Triangle: (" + vertice1.getX() + ", " + vertice1.getY() + "), (" + vertice2.getX() + ", " + vertice2.getY()+ "), (" + vertice3.getX() + ", " + vertice3.getY() +").";
    }

    public double getPerimeter(){
        return vertice1.distance(vertice2) + vertice2.distance(vertice3) + vertice3.distance(vertice1);
    }
    
    public void printType(){
        if (vertice1.distance(vertice2) == vertice2.distance(vertice3)  && vertice2.distance(vertice3) == vertice3.distance(vertice1) && vertice3.distance(vertice1) == vertice1.distance(vertice2)) {
            System.out.print("equilateral");     
        }else if (vertice1.distance(vertice2) == vertice2.distance(vertice3)  || vertice2.distance(vertice3) == vertice3.distance(vertice1) || vertice3.distance(vertice1) == vertice1.distance(vertice2)) {
            System.out.println("isosceles");
        }else{
            System.out.println("scalene");
        }
    }
}
//equilateral: đều 
//isosceles: cân
//scalene: lệch