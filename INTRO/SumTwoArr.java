package INTRO;
import java.util.Scanner;

public class SumTwoArr {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter number of first array: ");
        int[] firstArray = new int[userInput.nextInt()];
        for (int i = 0; i < firstArray.length; i++) {
            System.out.printf("Enter number %d: ", i + 1);
            firstArray[i] = userInput.nextInt();
        }

        System.out.print("Enter number of second array: ");
        int[] secondArray = new int[userInput.nextInt()];
        for (int i = 0; i < secondArray.length; i++) {
            System.out.printf("Enter number %d: ", i + 1);
            secondArray[i] = userInput.nextInt();
        }
        int[] newArray;
        if (firstArray.length == secondArray.length) {
            newArray = new int[firstArray.length];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = firstArray[i] + secondArray[i];
            }
        }else{
            if (firstArray.length > secondArray.length) {
                newArray = new int[firstArray.length];
                for (int i = 0; i < secondArray.length; i++) {
                    newArray[i] = firstArray[i] + secondArray[i];
                }
                for(int i = secondArray.length; i < firstArray.length; i ++){
                    newArray[i] = firstArray[i];
                }
            }else{
                newArray = new int[secondArray.length];
                for(int i = 0; i < firstArray.length; i ++){
                    newArray[i] = firstArray[i] + secondArray[i];
                }
                for(int i = firstArray.length; i < secondArray.length; i ++){
                    newArray[i] = secondArray[i];
                }
            }
        }
        System.out.print("First array: ");
        for(int i = 0; i < firstArray.length; i ++){
            System.out.print(firstArray[i] + " ");
        }
        System.out.print("\nSecond array: ");
        for(int i = 0; i < secondArray.length; i ++){
            System.out.print(secondArray[i] + " ");
        }
        System.out.print("\nArray after added: ");
        for(int i = 0; i < newArray.length; i ++){
            System.out.print(newArray[i] + " ");
        }
        userInput.close();
    }
    
    
}
