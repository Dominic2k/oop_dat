package TESTCLASSES;
import CLASSES.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student("Dat", 24);

        std1.inputStudent();
        std2.displayStudent();
        std1.displayStudent();
    }
}
