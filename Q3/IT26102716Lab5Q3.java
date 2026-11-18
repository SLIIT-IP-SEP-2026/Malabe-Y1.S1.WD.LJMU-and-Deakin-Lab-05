import java.util.Scanner;

public class IT26102756Lab5Q3 {
    // Define Constants
    static final double ROOM_CHARGE_PER_DAY = 48000.0;
    static final double DISCOUNT_3_4_DAYS = 0.10; // 10%
    static final double DISCOUNT_5_OR_MORE = 0.20; // 20%

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

        // Validation 1: Start date and end date cannot be less than 1 or greater than 31
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        // Validation 2: Start date should be less than the end date
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        // Calculate number of days reserved
        int numberOfDays = endDate - startDate;
        
        // Calculate total amount with discount based on days reserved
        double totalAmount = numberOfDays * ROOM_CHARGE_PER_DAY;

        if (numberOfDays >= 3 && numberOfDays <= 4) {
            totalAmount = totalAmount - (totalAmount * DISCOUNT_3_4_DAYS);
        } else if (numberOfDays >= 5) {
            totalAmount = totalAmount - (totalAmount * DISCOUNT_5_OR_MORE);
        }
        // If < 3 days, no discount is applied

        System.out.println("\nRoom Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + numberOfDays);
        System.out.println("Total Amount to be Paid: " + totalAmount);

        scanner.close();
    }
}