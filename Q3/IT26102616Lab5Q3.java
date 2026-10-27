import java.util.Scanner;

public class IT26102616Lab5Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.0;

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        // Validation 1
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        // Validation 2
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int daysReserved = endDate - startDate;
        double discountRate = 0;

        if (daysReserved >= 3 && daysReserved <= 4) {
            discountRate = 0.10;
        } else if (daysReserved >= 5) {
            discountRate = 0.20;
        }

        double totalAmount = (ROOM_CHARGE * daysReserved) * (1 - discountRate);

        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE + "/=");
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmount);

        input.close();
    }
}
