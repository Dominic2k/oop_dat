package INTRO;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your grade: ");
            int userGrade = userInput.nextInt();
            if (userGrade <= 100 && userGrade >=0) {
                if (userGrade >= 75) {
                    System.out.println("Grade: A");
                    break;
                }else if (userGrade >= 60) {
                    System.out.println("Grade: B");
                    break;
                }else if(userGrade >= 45){
                    System.out.println("Grade: C");
                    break;
                }else if(userGrade >= 35){
                    System.out.println("Grade: D");
                    break;
                }else{
                    System.out.println("Grade: E");
                    break;
                }
            }else{
                System.out.println("Please enter your grade from 0 to 100!");
            }
        }
        userInput.close();
    }
}
