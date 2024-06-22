package TESTCLASSES;

import CLASSES.Line;
import CLASSES.Point;

public class TestLine {
    public static void main(String[] args) {
        Line line1 = new Line(0, 0, 3, 4);
        System.out.println(line1);
    
        Point point1 = new Point(1, 2);
        Point point2 = new Point(6,7);
        Line line2 = new Line(point1, point2);
        System.out.println(line2);
        System.out.println(line1.getLength());
        System.out.println(line2.getGradient());

    }
 }
