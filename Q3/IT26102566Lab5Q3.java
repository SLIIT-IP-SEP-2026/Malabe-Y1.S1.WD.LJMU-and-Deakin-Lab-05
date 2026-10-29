import java.util.Scanner;

public class IT26102566Lab5Q3 {
    public static void main(String[] args) {
        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_3_TO_4_DAYS = 10;
        final double DISCOUNT_5_OR_MORE = 20;

        Scanner input = new Scanner(System.in);

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

        int days = endDate - startDate;
        double total = days * ROOM_CHARGE;

        if (days >= 5) {
            total = total - (total * DISCOUNT_5_OR_MORE / 100);
        } else if (days >= 3) {
            total = total - (total * DISCOUNT_3_TO_4_DAYS / 100);
        }

        System.out.println();
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE + "/=");
        System.out.println("Number of Days Reserved: " + days);
        System.out.println("Total Amount to be Paid: " + total);
    }
}