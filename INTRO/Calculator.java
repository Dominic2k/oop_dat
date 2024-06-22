package INTRO;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap so luong bieu thuc: ");
        int numExpressions = input.nextInt();
        while (numExpressions <= 0) {
            System.out.println("Vui long nhap so nguyen duong");
            numExpressions = input.nextInt();
        }
        input.nextLine();
        int i = 0;
        while (i < numExpressions) {
            System.out.printf("Nhap bieu thuc %d (vi du: 2 + 3): ", i);
            System.out.print("Vui long nhap nhu vi du khong thua khong thieu dau cach: ");
            String expression = input.nextLine();
            String[] parts = expression.split(" ");
            if (parts.length != 3) {
                System.out.println("Bieu thuc khong hop le!");
                continue;
            }
            int num1 = Integer.parseInt(parts[0]);
            int num2 = Integer.parseInt(parts[2]);
            String operator = parts[1];
            int result;
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Khong the chia cho 0!");
                        continue;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Toan tu khong hop le!");
                    continue;
            }
            System.out.printf("Ket qua co duoc la: %d %s %d = %d%n", num1, operator, num2, result);
            i++;
        }
        input.close();
    }
}
