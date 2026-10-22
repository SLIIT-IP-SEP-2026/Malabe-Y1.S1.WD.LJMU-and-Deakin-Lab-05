
import java.util.Scanner;

public class IT26102428Lab5Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        System.out.print("Enter start date: ");
        int startDate = input.nextInt();

        System.out.print("Enter end date: ");
        int endDate = input.nextInt();

        // Validation 1
        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Invalid date");

        // Validation 2
        } else if (startDate >= endDate) {

            System.out.println(
                "Start date should be less than end date"
            );

        } else {

            int daysReserved = endDate - startDate;

            double totalAmount = daysReserved * ROOM_CHARGE;
            double discountRate = 0.0;

            if (daysReserved >= 3 && daysReserved <= 4) {
                discountRate = DISCOUNT_10;
            } else if (daysReserved >= 5) {
                discountRate = DISCOUNT_20;
            }

            double discountAmount =
                totalAmount * discountRate;

            double amountToPay =
                totalAmount - discountAmount;

            System.out.println(
                "Number of days reserved: " + daysReserved
            );

            System.out.printf(
                "Room charges: Rs. %.2f%n", totalAmount
            );

            System.out.printf(
                "Discount: Rs. %.2f%n", discountAmount
            );

            System.out.printf(
                "Total amount to be paid: Rs. %.2f%n",
                amountToPay
            );
        }

        input.close();
    }
}
