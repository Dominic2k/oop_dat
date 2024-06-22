package INTRO;

import java.util.Scanner;

public class ProgramCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your expression (Ex: 2 + 3): ");
            String myString = userInput.nextLine();

            String[] listPart = myString.split(" ");

            while (listPart.length != 3) {
                System.out.print("Error, please enter 2 integers and 1 operator like this (2 + 3): ");
                myString = userInput.nextLine();
                listPart = myString.split(" ");
            }

            int firstInteger = Integer.parseInt(listPart[0]);
            int lastInteger = Integer.parseInt(listPart[2]);
            char midOperator = listPart[1].charAt(0);

            int result = 0;
            boolean checkdivided0 = true;

            switch (midOperator) {
                case '+':
                    result = firstInteger + lastInteger;
                    break;
                case '-':
                    result = firstInteger - lastInteger;
                    break;
                case '*':
                    result = firstInteger * lastInteger;
                    break;
                case '/':
                    if (lastInteger == 0) {
                        System.out.println("Not divided by 0, please enter again.");
                        checkdivided0 = false;
                    } else {
                        result = firstInteger / lastInteger;
                    }
                    break;
                default:
                    System.out.println("Error, please enter right format.");
                    checkdivided0 = false;
                    break;
            }
            if (checkdivided0 == true) {
                System.out.printf("%d %c %d = %d", firstInteger, midOperator, lastInteger, result);
                break;
            }
        }
        userInput.close();
    }
}
    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);

    //     System.out.print("Enter an expression (ex: 2 + 3): ");
    //     String string_expression = input.nextLine();

    //     String[]list_part = string_expression.split(" ");

    //     int firstInteger = Integer.parseInt(list_part[0]);
    //     int secondInteger = Integer.parseInt(list_part[2]);
    //     char midOperator = list_part[1].charAt(0);


    //     int result = 0;
    //     boolean is_devided_zero = false;
    //     boolean is_right_format = true;
    //     switch (midOperator) {
    //         case '+':
    //             result = firstInteger + secondInteger;
    //             break;
    //         case '-':
    //             result = firstInteger - secondInteger;
    //             break;
    //         case '*':
    //             result = firstInteger * secondInteger;
    //             break;
    //         case '/':
    //             if (secondInteger == 0) {
    //                 System.out.print("Not divide by 0.");
    //                 is_devided_zero = true;
    //             }
    //             else{
    //                 result = firstInteger / secondInteger;
    //             }
    //         default:
    //             System.out.println("Please enter right format.");
    //             is_right_format = false;
    //             break;
    //     }
    //     if (is_right_format == true || is_devided_zero == false) {
    //         System.out.printf("%d %c %d = %d", firstInteger, midOperator, secondInteger, result);
    //     }
    //     input.close();
    
    // }
// }
