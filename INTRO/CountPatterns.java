package INTRO;

/**
 * CountPatterns
 */
public class CountPatterns {

    public static void main(String[] args) {
        for (int i = 1; i < 6; i++){
            for (int j = 1; j < 6; j++){
                if (j < i) {
                    System.out.print("*");
                }else if (j == i) {
                    System.out.println(j);
                    break;
                }
            }
        }
    }
}