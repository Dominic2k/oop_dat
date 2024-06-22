package TESTCLASSES;

import CLASSES.Rectangle;
import CLASSES.Square;

public class TestShape {
    public static void main(String[] args) {
        Square square1 = new Square(23);

        System.out.println(square1.toString());

        Rectangle rectangle1 = new Rectangle(12, 23, "Red", false);

        System.out.println(square1.toString());
        System.out.println(rectangle1.toString());
    }
}
