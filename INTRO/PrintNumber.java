package INTRO;

public class PrintNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 7;i++){
            for(int j = 1; j <= 7; j++){
                if (j <= i) {
                    System.out.print("*");
                }else{
                    System.out.println();
                    break;
                }
                
            }
        }
    }
}
