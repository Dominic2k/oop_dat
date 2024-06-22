package INTRO;
import java.util.*;

public class Fibonacci2 {
    public static void main(String[]args){
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your limit: ");
        int limit = userInput.nextInt();

        System.out.print("Fibnonacci: ");
        for (int i = 1; i <= limit; i ++){
            if (Fibonacci(i) >= limit) {
                System.out.print(".");
                break;
            }
            System.out.print(" " + Fibonacci(i));
        }
        userInput.close();
        }
    static int Fibonacci(int number){
        if (number == 1 || number == 0) {
            return 1;
        }else{
            return Fibonacci(number - 1) + Fibonacci(number - 2);
        }
    }
}

