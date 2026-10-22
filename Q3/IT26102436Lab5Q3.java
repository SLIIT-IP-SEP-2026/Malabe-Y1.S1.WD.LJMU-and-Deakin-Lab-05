import java.util.Scanner;

public class IT26102436Lab5Q3 {

    public static void main(String[] args) {

        // Constants
        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_3_TO_4_DAYS = 10.0;
        final double DISCOUNT_5_OR_MORE_DAYS = 20.0;

        Scanner input = new Scanner(System.in);

        // Input dates
        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        // Validation 1: Check date range
        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println(
                "Error: Days must be between 1 and 31"
            );

        }
        // Validation 2: Start date must be less than end date
        else if (startDate >= endDate) {

            System.out.println(
                "Error: Start Date must be less than End Date"
            );

        }
        else {

            // Calculate number of days reserved
            int daysReserved = endDate - startDate;

            // Calculate room charge
            double totalAmount = daysReserved * ROOM_CHARGE;
            double discountRate = 0.0;

            // Determine discount rate
            if (daysReserved >= 5) {
                discountRate = DISCOUNT_5_OR_MORE_DAYS;
            }
            else if (daysReserved >= 3) {
                discountRate = DISCOUNT_3_TO_4_DAYS;
            }

            // Calculate discount and final amount
            double discountAmount =
                totalAmount * discountRate / 100;

            totalAmount = totalAmount - discountAmount;

            // Display results
            System.out.printf(
                "Room Charge Per Day: Rs %.2f%n", ROOM_CHARGE
            );

            System.out.println(
                "Number of Days Reserved: " + daysReserved
            );

            System.out.printf(
                "Total Amount to be Paid: Rs %.2f%n",
                totalAmount
            );
        }

        input.close();
    }
}
