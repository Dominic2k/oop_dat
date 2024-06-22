package INTRO;
import java.util.Scanner;

public class CheckDay {

    public static void main(String[] args) {
        Scanner yourInput = new Scanner(System.in);

        System.out.print("Nhập tên ngày (Ví dụ: Hai, Ba, Bảy, v.v.): ");
        String dayName = yourInput.nextLine();

        switch (dayName) {
            case "Hai", "Ba", "Tu", "Nam", "Sau": 
                System.out.println("Weekday");
                break;
            case "Bay", "Chu Nhat":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Tên ngày không hợp lệ.");
        }
        yourInput.close();
    }
}
