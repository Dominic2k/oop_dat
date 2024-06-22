package TESTCLASSES;
import java.util.Scanner;

public class TestFinalExam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of array: ");
        int[]my_array = new int[input.nextInt()];

        for (int i = 0; i < my_array.length; i++) {
            System.out.printf("Enter number %d: ",i+1);
            my_array[i] = input.nextInt();
        }

        System.out.println("Enter number you want to find: ");
        int numberCheck = input.nextInt();
        boolean isFinded = false;
        for(int i = 0; i < my_array.length; i++){
            if(numberCheck == my_array[i]){
                isFinded = true;
                System.out.printf("Number %d at position %d", numberCheck, i);
                break;
            }
        }
        if(isFinded == false) {
            System.out.print("Don't have the number you want to find.");
        }
        input.close();
    }
}
