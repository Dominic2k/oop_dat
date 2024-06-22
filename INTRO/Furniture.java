package INTRO;
import java.util.Scanner;

public class Furniture {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter your choice (1 for pine, 2 for oak, or 3 for mahogany): ");
        int userChoiceWood = userInput.nextInt();

        while (userChoiceWood < 1 || userChoiceWood > 3) {
            System.out.print("Your choice: None. Price: $0.");
            System.out.print("Please enter again (1, 2 or 3 ): ");
            userChoiceWood = userInput.nextInt();
        }
        String type1 = "Pine", type2 = "Oak",type3 = "Mahogany";
        int currentPrice = 0;
        String currentType = "None";
        if (userChoiceWood == 1) {
            currentPrice = 100;
            currentType = type1;
            System.out.printf("Your choice: %s. Price: $%d\n", currentType, currentPrice);
        }else if(userChoiceWood == 2){
            currentPrice = 225;
            currentType = type2;
            System.out.printf("Your choice: %s. Price: $%d\n", currentType, currentPrice);
        }else if(userChoiceWood == 3){
            currentPrice = 310;
            currentType = type3;
            System.out.printf("Your choice: %s. Price: $%d\n", currentType, currentPrice);
        }

        System.out.print("What size of table do you want? Big(1) or Small(2) ");
        int userChoiceSize = userInput.nextInt();
        String currentSize = "big";
        
        while (userChoiceSize < 1 || userChoiceSize > 2) {
            System.out.print("Size value is invalid, please enter again 1 or 2: ");
            userChoiceSize = userInput.nextInt();
        }

        if (userChoiceSize == 1) {
            currentPrice += 35;
            System.out.printf("Your final price with %s table size %s is: $%d.",currentType.toLowerCase(), currentSize, currentPrice);
        }else{
            currentSize = "small";
            System.out.printf("Your final price with %s table size %s is: $%d.",currentType.toLowerCase(), currentSize, currentPrice);
        }
        userInput.close();
    }
}
