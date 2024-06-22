package INTRO;
import java.util.Scanner;

public class CircularArea {
    public static void main(String[] args) {
        while (true) {
            Scanner yourInput = new Scanner(System.in);
            try{
                System.out.print("Enter radius: ");
                float yourRadius = yourInput.nextFloat();
                double result = Math.PI * (yourRadius * yourRadius);
                System.out.printf("CircularArea is: %.2f %n", result);
                yourInput.close();
                break;
            } catch (Exception e){
                System.out.printf("Please enter a number. %n");
            }
        }
    }
}
