package INTRO;
import java.util.Scanner;

public class PizzaChoice {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        float priceOfPizza;
        System.out.print("Please choice size of your pizza (S,M,L,X): ");
        String choice = userInput.nextLine();
        while (true) {
            if (choice.equals("S")) {
                priceOfPizza = 6.99f;
                System.out.println("Price: $" + priceOfPizza);
                break;
            }else if (choice.equals("M")) {
                priceOfPizza = 8.99f;
                System.out.println("Price: $" + priceOfPizza);
                break;
            }else if (choice.equals("L")) {
                priceOfPizza = 12.50f;
                System.out.println("Price: $" + priceOfPizza);
                break;
            }else if (choice.equals("X")) {
                priceOfPizza = 15.00f;
                System.out.println("Price: $" + priceOfPizza);
                break;
            }else{
                System.out.print("Error, please enter again: ");
                choice = userInput.nextLine();
            }
        }
        userInput.close();
    }
}
