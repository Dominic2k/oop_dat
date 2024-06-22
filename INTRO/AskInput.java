package INTRO;
import java.util.Scanner;

public class AskInput {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("What is your full name? ");
        String yourFullname = userInput.nextLine();
        System.out.print("How old are you? ");
        int yourAge = userInput.nextInt();
        userInput.nextLine();
        System.out.print("Where do you come from? ");
        String yourAddress = userInput.nextLine();

        System.out.printf("Your full information: %s, %d, %s", yourFullname, yourAge, yourAddress);
        userInput.close();
    }
}