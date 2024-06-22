package INTRO;


/**
 * AdvancePatterns
 */
public class AdvancePatterns {
    public static void main(String[]args){
        for (int i = 1; i < 8; i++){
            for(int j = 1; j < 8; j++){
                if (j <= i ){
                    System.out.print("*");
                }else{
                    System.out.println();
                    break;
                }
            }
        }
    }
}
