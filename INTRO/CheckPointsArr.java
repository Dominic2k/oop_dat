package INTRO;
import java.util.Scanner;

public class CheckPointsArr {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int[] intArr;
        System.out.print("Enter number of array: ");
        intArr = new int[userInput.nextInt()];

        for (int i = 0; i < intArr.length; i ++){
            System.out.printf("Enter number %d: ",i+1);
            intArr[i] = userInput.nextInt();
        }
        // for (int i = 0; i < intArr.length; i++) {
        //     intArr[i] = (int)(Math.random() * 100);
        // }

        // System.out.print("All element of array: ");
        // for(int i = 0; i < intArr.length; i++){
        //     System.out.print(intArr[i] + " ");
        // }


        // int sumArr = 0;
        // for (int i = 0; i < intArr.length; i++) {
        //     sumArr += intArr[i];
        // }

        // System.out.println(sumArr);

        // int maxElement = intArr[0];
        // for (int i = 1; i < intArr.length; i++) {
        //     if (maxElement < intArr[i]) {
        //         maxElement = intArr[i];
        //     }
        // }

        // System.out.println(maxElement);

        // int minNumber = intArr[0];
        // for (int i = 0; i < intArr.length; i++) {
        //     if (minNumber > intArr[i]) {
        //         minNumber = intArr[i];
        //     }
        // }
        // System.out.println(minNumber);

        // int tmp;
        // for (int i = 0; i < intArr.length - 1; i++) {
        //     for (int j = i + 1; j < intArr.length; j++) {
        //         if (intArr[i] > intArr[j]){
        //             tmp = intArr[i];
        //             intArr[i] = intArr[j];
        //             intArr[j] = tmp;
        //         }
        //     }
        // }
        // for (int i = 0; i < intArr.length; i++) {
        //     System.out.println(intArr[i]);
        // }
        // int tmp;
        // for (int i = 0; i < intArr.length - 1; i++) {
        //     for (int j = i + 1; j < intArr.length; j++) {
        //         if (intArr[i] < intArr[j]){
        //             tmp = intArr[i];
        //             intArr[i] = intArr[j];
        //             intArr[j] = tmp;
        //         }
        //     }
        // }
        // for (int i = 0; i < intArr.length; i++) {
        //     System.out.println(intArr[i]);
        // }

        System.out.print("Enter number you want to find: ");
        int checkNumber = userInput.nextInt();
        boolean isFinded = false;
        for (int i = 0; i < intArr.length; i++){
            if(checkNumber == intArr[i]){
                isFinded = true;
                System.out.printf("Số %d nằm ở vị trí thứ %d",checkNumber,i);
                break;
            }
        }
        if (isFinded == false) {
            System.out.printf("Không tìm thấy số %d trong mảng", checkNumber);
        }
        userInput.close();
    }
}
