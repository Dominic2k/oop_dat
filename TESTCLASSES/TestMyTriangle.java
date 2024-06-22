package TESTCLASSES;
import CLASSES.MyPoint;
import CLASSES.MyTriangle;

public class TestMyTriangle{
    public static void main(String[]args){

        MyPoint point1 = new MyPoint(3,2);
        MyPoint point2 = new MyPoint(4,5);
        MyPoint point3 = new MyPoint(6,7);

        MyTriangle triangle1 = new MyTriangle(0,0,4,0,2,3);
        MyTriangle triangle2 = new MyTriangle(point1, point2, point3);

        triangle1.printType();
        triangle2.printType();
        
    }
}