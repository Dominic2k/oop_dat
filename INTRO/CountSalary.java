package INTRO;

public class CountSalary {
    public static void main(String[] args) {
        float basicSalary = 12000, dearlyAllowance = (12/100) * basicSalary, houseRentAllowance = 150, travelAllowance = 120, orthers = 450, providentFund = (14/100) * basicSalary, incomeTax = (15/100) * basicSalary;
        System.out.printf("Your net salary: $%.2f", basicSalary + dearlyAllowance + houseRentAllowance + travelAllowance + orthers - (providentFund + incomeTax));
    }
}
