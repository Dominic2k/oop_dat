package INTRO;
import java.util.Scanner;
public class SumNumber {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter value n: ");
        int number = userInput.nextInt();

        
        while (number < 1 || number > 50) {
            System.out.print("Please enter a number from 1 to 50: ");
            number = userInput.nextInt();
        }
        int sum = 0;
        for(int i = 1; i <= number; i++){
            sum += i;
        }

        System.out.printf("The sum of 1 to n is: %d", sum);
        userInput.close();
    }
}
