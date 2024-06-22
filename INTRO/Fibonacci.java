package INTRO;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        while (true) {
            System.out.print("Enter limit of series: ");
            int limitedNumber = userInput.nextInt();

            if(limitedNumber > 1){
                int i = 1;
                int beforeI = 0;
                int sum = 1;
                do {
                    System.out.print(sum + " ");
                    sum = i + beforeI;
                    beforeI = i;
                    i = sum;
                } while (sum < limitedNumber);
                break;
            }else{
                System.out.println("Please enter again! your number must be > 1.");
            }
        }
        userInput.close();
    }
}
//1,1,2,3,5,8,13,21
