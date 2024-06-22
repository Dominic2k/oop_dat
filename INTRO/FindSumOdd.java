package INTRO;
import java.util.Scanner;

public class FindSumOdd {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = userInput.nextInt();
        
        System.out.print("Enter number 2: ");
        int num2 = userInput.nextInt();

        int maxNumber = 0;
        int minNumber = 0;
        if (num1 > num2){
            maxNumber = num1;
            minNumber = num2;
        }else{
            maxNumber = num2;
            minNumber = num1;
        }
        int sum = 0;
        for(int i = minNumber; i <= maxNumber; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        System.out.printf("Sum of all odd numbers between the two numbers entered is: %d", sum);
        userInput.close();
    }
}
