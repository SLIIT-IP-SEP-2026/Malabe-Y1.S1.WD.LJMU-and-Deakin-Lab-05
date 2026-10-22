import java.util.Scanner;

public class IT26102783Lab5Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final double ROOM_CHARGE_PER_DAY = 48000.00;
        final int DISCOUNT_3_TO_4_DAYS = 10;
        final int DISCOUNT_5_OR_MORE_DAYS = 20;
        
        System.out.print("Enter Start Date (1-31): ");
        int startDate = sc.nextInt();
        
        System.out.print("Enter End Date (1-31): ");
        int endDate = sc.nextInt();
        

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            sc.close();
            return;
        }
        
        
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            sc.close();
            return;
        }
        
        int noOfDays = endDate - startDate;
        double totalAmount = ROOM_CHARGE_PER_DAY * noOfDays;
        double discountRate = 0;
        
        if (noOfDays >= 3 && noOfDays <= 4) {
            discountRate = DISCOUNT_3_TO_4_DAYS;
        } else if (noOfDays >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        }
        
        double discount = totalAmount * discountRate / 100;
        totalAmount = totalAmount - discount;
        
        System.out.println("\nRoom Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + noOfDays);
        System.out.println("Total Amount to be Paid: " + totalAmount);
        
        sc.close();
    }
}