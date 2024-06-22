package CLASSES;
import java.util.Scanner;


public class Circle {
    private double radius;
    private String color;

    public Circle(){
        radius = 1.0;
        color = "red";
    }
    public Circle(double radius){
        this.radius = radius;
        color = "red";
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public String getColor(){
        return color;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
      
    public void setColor(String color){

        this.color = color;
    }
    public String toString(){
        return "Circle: " + radius + " color: " + color;
    }

    public void inputCircle(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your radius: ");
        // int myRadius = input.nextInt();
        this.radius = input.nextInt();
        input.nextLine();

        System.out.print("Enter your color: ");
        // String myColor = input.nextLine();

        this.color = input.nextLine();
        input.close();
    }

    public void displayCircle1(){
        System.out.println("Ten cua toi " + this.radius + "  " + this.color);
    }
    public String displayCircle2(){
        return "Name: " + radius + "Color: " + color;
    }
}

