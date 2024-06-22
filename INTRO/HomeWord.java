package INTRO;
import java.util.Scanner;
// class HomeWord {
//     public static void main(String[] args) {
//       Scanner myInput = new Scanner(System.in);
//       System.out.println("Enter your name: ");
      
//       String userName = myInput.nextLine();
//       System.out.println("Username is: " + userName);
//       myInput.close();
//     }
// }
/**
 * HomeWord
 */
public class HomeWord {

    public static void main(String[] args) {
        Scanner newInput = new Scanner(System.in);

        // System.out.print("Enter first number: ");
        // int firstNumber = newInput.nextInt();

        // System.out.print("Enter second number: ");
        // int secondNumber = newInput.nextInt();

        // String result = (firstNumber > secondNumber) ? "Min number is: " + secondNumber : "Min number is: " + firstNumber;
        // System.out.print(result);
        System.out.print("Enter a month: ");
        int yourMonth = newInput.nextInt();

        switch (yourMonth) {
            case 1:
                System.out.print("Tháng 1");
                break;
            case 2:
                System.out.print("Tháng 2");
                break;
            case 3:
                System.out.print("Tháng 3");
                break;
        
            default:
                System.out.print("No thing");
                break;
        }
        newInput.close();
    }
}
