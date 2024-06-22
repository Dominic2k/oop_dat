package INTRO;

import java.util.Scanner;

public class MontekSalary {

    public static void main(String[] args) {
        Scanner yourInput = new Scanner(System.in);

        System.out.print("Enter your monthly salary: ");
        double salary = yourInput.nextDouble();
        // yourInput.nextLine();

        System.out.print("Enter your grade (A, B, or others): ");
        String grade = yourInput.nextLine();//.toUpperCase().trim();
        double allowance;
        if (grade.equals("A")) {
            allowance =300;
        }else if(grade.equals("B")){
            allowance = 250;
        }else{
            allowance = 100;
        }
        double totalSalary = salary + allowance;
        String formattedSalary = String.format("%.0f", totalSalary);
        System.out.println("Your total salary for the month is: $" + formattedSalary);
        
        yourInput.close();
    }
}
