package INTRO;
import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the number of student: ");
        int numberOfStudents = userInput.nextInt();
        userInput.nextLine();

        while (numberOfStudents < 1) {
            System.out.print("Error, please enter again (>1): ");
            numberOfStudents = userInput.nextInt();
        }
        System.out.printf("Enter " + numberOfStudents + " scores: ");
        String userString = userInput.nextLine();

        String[] listScore = userString.split(" ");

        while (listScore.length != numberOfStudents) {
            System.out.printf("Error, please %d number: ", numberOfStudents);
            userString = userInput.nextLine();
            listScore = userString.split(" ");
        }

        int maxNumber = Integer.parseInt(listScore[0]);

        for(int i = 1; i < listScore.length; i++){
            if (Integer.parseInt(listScore[i]) > maxNumber){
                maxNumber = Integer.parseInt(listScore[i]);
            }
        }

        String rank;
        for(int j = 0; j < listScore.length; j++){
            if(Integer.parseInt(listScore[j]) >= maxNumber - 5){
                rank = "A";
                System.out.printf("Student %d score is %s and grade is %s.\n", j, listScore[j], rank);
            }else if (Integer.parseInt(listScore[j]) >= maxNumber - 10) {
                rank = "B";
                System.out.printf("Student %d score is %s and grade is %s.\n", j, listScore[j], rank);
            }else if (Integer.parseInt(listScore[j]) >= maxNumber - 15) {
                rank = "C";
                System.out.printf("Student %d score is %s and grade is %s.\n", j, listScore[j], rank);
            }else if (Integer.parseInt(listScore[j]) >= maxNumber - 20) {
                rank = "D";
                System.out.printf("Student %d score is %s and grade is %s.\n", j, listScore[j], rank);
            }else{
                rank = "F";
                System.out.printf("Student %d score is %s and grade is %s.\n", j, listScore[j], rank);
            }
        }
        userInput.close();
    }
}
