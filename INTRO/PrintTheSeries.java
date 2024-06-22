package INTRO;
public class PrintTheSeries {
    public static void main(String[] args) {
        for(int i = 100; i >= 5; i -= 5){
            if(i == 5){
                System.out.println(i);
                break;
            }
            System.out.print(i + ", ");
        }    
    }
}

