import java.util.Scanner;

public class IT26102427Lab5Q3 {

    public static void main(String[] args) {

        final double ROOM_CHARGE_PER_DAY = 48000.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            input.close();
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            input.close();
            return;
        }

        int daysReserved = endDate - startDate;

        double discountRate = 0;

        if (daysReserved >= 3 && daysReserved <= 4) {
            discountRate = 10;
        } else if (daysReserved >= 5) {
            discountRate = 20;
        }

        double amount = daysReserved * ROOM_CHARGE_PER_DAY;
        double discountAmount = amount * (discountRate / 100);
        double totalAmount = amount - discountAmount;

        System.out.println();
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Discount Amount: Rs. " + discountAmount);
        System.out.println("Total Amount to be Paid: " + totalAmount);

        input.close();
    }
}