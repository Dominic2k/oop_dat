package TESTCLASSES;

import CLASSES.Point;

public class TestPoint {
    public static void main(String[]args){
        Point point1 = new Point(3, 2);

        System.out.println(point1);
        System.out.println(point1.toString());

        point1.setXY(100, 10);
        System.out.println(point1.toString());
        
    }
}
