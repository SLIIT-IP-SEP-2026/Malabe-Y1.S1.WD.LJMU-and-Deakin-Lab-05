import java.util.Scanner;

public class IT26102324Lab5Q3 {
    public static void main(String[] args) {
        // CONSTANTS
        final double ROOM_CHARGE = 48000.0;
        final double DISCOUNT_10 = 10.0;
        final double DISCOUNT_20 = 20.0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Start Date (1-31): ");
        int start = sc.nextInt();
        
        System.out.print("Enter End Date (1-31): ");
        int end = sc.nextInt();
        
        // Validation 1 - 1 to 31 check
        if (start < 1 || start > 31 || end < 1 || end > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }
        
        // Validation 2 - start < end check
        if (start >= end) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }
        
        int days = end - start;
        double totalAmount = days * ROOM_CHARGE;
        double discount = 0;
        
        if (days >= 3 && days <= 4) {
            discount = totalAmount * DISCOUNT_10 / 100;
        } else if (days >= 5) {
            discount = totalAmount * DISCOUNT_20 / 100;
        }
        
        double finalAmount = totalAmount - discount;
        
        System.out.println("\nRoom Charge Per Day: Rs. " + ROOM_CHARGE + "0/=");
        System.out.println("Number of Days Reserved: " + days);
        System.out.println("Total Amount to be Paid: " + finalAmount);
    }
}