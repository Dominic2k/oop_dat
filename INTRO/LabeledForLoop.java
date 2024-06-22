package INTRO;

public class LabeledForLoop {
    public static void main(String[] args) {
        int i, j;
        outer:
        for (i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                System.out.print("3, ");
                break outer;
            }
            System.out.println("Hello ");
            inner:
            for (j = 1; j <= 10; j++) {
                System.out.print(j + " ");
                if (j == 9 || j == 5){
                    break inner; // Breaks out of the inner loop
                }
                System.out.println("Jack");
            }
        }
        System.out.print("Done");
    }
}