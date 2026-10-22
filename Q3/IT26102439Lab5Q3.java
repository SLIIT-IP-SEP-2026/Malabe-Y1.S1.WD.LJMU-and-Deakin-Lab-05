import java.util.Scanner;

public class IT26102439Lab5Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        int startDate, endDate, daysReserved;
        double discountRate, totalAmount;

        System.out.print("Enter Start Date (1-31): ");
        startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        endDate = input.nextInt();

        // Validation 1
        if (startDate < 1 || startDate > 31
                || endDate < 1 || endDate > 31) {

            System.out.println("Error: Days must be between 1 and 31.");

            input.close();
            return;
        }

        // Validation 2
        if (startDate >= endDate) {

            System.out.println("Error: Start Date must be less than End Date.");

            input.close();
            return;
        }

        
        daysReserved = endDate - startDate;

        
        if (daysReserved < 3) {
            discountRate = 0;
        } else if (daysReserved <= 4) {
            discountRate = DISCOUNT_10;
        } else {
            discountRate = DISCOUNT_20;
        }

        
        totalAmount = daysReserved * ROOM_CHARGE;
        totalAmount = totalAmount * (1 - discountRate);

        System.out.println();
        System.out.printf("Room Charge Per Day: Rs. %.2f/=%n", ROOM_CHARGE);
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.printf("Total Amount to be Paid: %.2f%n", totalAmount);

        input.close();
    }
}