package INTRO;


public class IntArray {
    public static void main(String[] args) {
        int[] myList = new int[5];
        myList[0] = 4;
        myList[1] = 2;
        myList[2] = 8;
        myList[3] = 7;
        myList[4] = 1;
        System.out.print("The integers from first to last: ");
        for(int i = 0;i < 5;i++){
            System.out.print(myList[i]);
        }
        System.out.print("\nThe integers from last to first: ");
        for(int j = 4; j>=0;j--){
            System.out.print(myList[j]);
        }

    }
}
