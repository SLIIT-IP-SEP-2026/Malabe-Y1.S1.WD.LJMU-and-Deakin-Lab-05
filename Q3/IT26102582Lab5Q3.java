import java.util.Scanner;

public class IT26102582Lab5Q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE_PER_DAY = 48000.00;
        final double DISCOUNT_10_PERCENT = 0.10;
        final double DISCOUNT_20_PERCENT = 0.20;

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }
		
		System.out.println();

        int numberOfDays = endDate - startDate;

        double discountRate;

        if (numberOfDays < 3) {
            discountRate = 0.0;
        } else if (numberOfDays <= 4) {
            discountRate = DISCOUNT_10_PERCENT;
        } else {
            discountRate = DISCOUNT_20_PERCENT;
        }

        double amountBeforeDiscount = numberOfDays * ROOM_CHARGE_PER_DAY;

        double discountAmount = amountBeforeDiscount * discountRate;

        double totalAmount = amountBeforeDiscount - discountAmount;

        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");

        System.out.println("Number of Days Reserved: " + numberOfDays);

        System.out.println("Total Amount to be Paid: Rs. " + totalAmount + "/=");
		
    }
}