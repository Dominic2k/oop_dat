package CLASSES;
import java.util.Scanner;

public class Student {
    String name;
    int age;

    public Student(){

    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void inputStudent(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        this.name = input.nextLine();

        System.out.println("Enter your age: ");
        this.age = input.nextInt();
        
        input.close();
    }

    public void displayStudent(){
        System.out.println("Name: " + this.name + "\nAge: " + this.age);
    }
}
