package TESTCLASSES;
import CLASSES.MyPoint;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint mp1 = new MyPoint(2,4);
        MyPoint mp2 = new MyPoint(0,5);

        System.out.println(mp1.distance(mp2));
        System.out.println(mp1.distance(5,6));


        MyPoint[] points = new MyPoint[10];
        for(int i = 0; i < points.length; i++){
            points[i] = new MyPoint();
        }

        for(int i = 0; i < points.length;i++) {
            System.out.println(points[i]);
        }


    }
    

}
