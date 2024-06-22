package INTRO;
import java.util.Scanner;

public class Prices {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        // double[] listPrices = new double[20];
        // for(int i = 0; i< 20; i++){
        //     System.out.printf("Enter the element %d: ", i+1);
        //     listPrices[i] = userInput.nextDouble();
        // }
        double[] listPrices = {3.5,5.6,6.7,7.8,8.9,9.1,32.4,45.6,56.7,33.4,11.4,55.7,1.3,3.5,5.6,6.7,7.8,8.9,9.1,32.4};
        double totalPrices = 0;
        
        for(double index : listPrices){
            totalPrices += index;
        }
        double average = totalPrices / (listPrices.length);
        
        System.out.printf("1. Total: $%3.2f", totalPrices);
        System.out.print("\n2. All values less than $5.00: ");
        for(int j = 0; j < listPrices.length; j++){
            if (listPrices[j] < 5.00) {
                System.out.print("$"+ listPrices[j] +" ");
            }
        }
        System.out.printf("\n3. Average: %3.2f", average);
        System.out.print("\n4. All values higher than average: ");
        for(int k = 0; k < listPrices.length; k++){
            if (listPrices[k] > average) {
                System.out.print("$"+ listPrices[k] +" ");
            }
        }

        userInput.close();
    }
}
