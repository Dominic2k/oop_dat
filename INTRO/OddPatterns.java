package INTRO;

public class OddPatterns {
    public static void main(String[] args) {
        for(int i = 1; i <= 7; i++){
            for (int j = 1; j <= 7; j++){
                if(i % 2 == 0){
                    if (j <= i) {
                            System.out.print(j);
                    }else{
                            System.out.println();
                            break;
                    }
                }else{
                    if (j <= i) {
                        if(j == (i/2)+1){
                            System.out.print("*");
                        }else{
                            System.out.print(j);
                        }
                    }else{
                        System.out.println();
                        break;
                    }

                }
            }
        }
    }
}
