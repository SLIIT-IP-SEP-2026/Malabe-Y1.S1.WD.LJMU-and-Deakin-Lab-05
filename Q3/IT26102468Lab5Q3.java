import java.util.Scanner;

public class IT26102468Lab5Q3 {
    public static void main(String[] args) {
        final double ROOM_CHARGE_PER_DAY = 48000.00;
        final double DISCOUNT_3_TO_4_DAYS = 10;
        final double DISCOUNT_5_OR_MORE_DAYS = 20;
        final int MIN_DATE = 1;
        final int MAX_DATE = 31;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        if (startDate < MIN_DATE || startDate > MAX_DATE
                || endDate < MIN_DATE || endDate > MAX_DATE) {
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

        double discountRate;
        if (daysReserved >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        } else if (daysReserved >= 3) {
            discountRate = DISCOUNT_3_TO_4_DAYS;
        } else {
            discountRate = 0;
        }

        double total = daysReserved * ROOM_CHARGE_PER_DAY;
        total = total - (total * discountRate / 100);

        System.out.println();
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + total);
		
    }
}