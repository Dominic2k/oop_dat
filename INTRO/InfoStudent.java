package INTRO;
import java.util.Scanner;

public class InfoStudent {
    public static void main(String[] args) {
        Scanner yourInput = new Scanner(System.in);

        System.out.print("Enter your fullname: ");
        String yourFullname = yourInput.nextLine();

        System.out.print("Enter your class: ");
        String yourClass = yourInput.nextLine();

        System.out.print("Enter your age: ");
        int yourAge = yourInput.nextInt();

        System.out.print("Enter your English score: ");
        float yourEnglishScore = yourInput.nextFloat();

        System.out.print("Enter your IT score: ");
        float yourITScore = yourInput.nextFloat();

        float yourAvgScore = (yourEnglishScore + yourITScore) / 2;

        System.out.println("----------------");
        System.out.printf("Your name: " + yourFullname + "%n" + "Your class: " + yourClass +"%n" + "Your age: " + yourAge + "%n" + "Your English score: %4.2f %n" + "Your IT score: %4.2f %n" + "Your average score: %4.2f",yourEnglishScore, yourITScore, yourAvgScore);
        yourInput.close();
    }
}
