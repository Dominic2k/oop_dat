package TESTCLASSES;
import CLASSES.MyPoint;
import CLASSES.MyCircle;

public class TestMyCircle {
    public static void main(String[] args) {

        MyPoint myPoint1 = new MyPoint(2, 3);
        MyPoint myPoint2 = new MyPoint(10, 12);

        MyCircle myCircle1 = new MyCircle(3,2,20);
        MyCircle myCircle2 = new MyCircle(myPoint1, 14);
        MyCircle myCircle3 = new MyCircle(myPoint2, 14);
        

        System.out.println(myCircle1.getArea());
        System.out.println(myCircle2.getArea());
        System.out.println(myCircle3.getArea());


    }
}
