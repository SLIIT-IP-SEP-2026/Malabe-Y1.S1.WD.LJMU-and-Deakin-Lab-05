import java.util.Scanner;

public class IT26102578Lab05Q3 {
    public static void main(String[] args) {
        final double ROOM_CHARGE = 48000.0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int start = sc.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int end = sc.nextInt();

        // Validation 1
        if (start < 1 || start > 31 || end < 1 || end > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        // Validation 2
        if (start >= end) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int daysReserved = end - start;
        double discountRate = 0;

        if (daysReserved >= 3 && daysReserved <= 4) {
            discountRate = 0.10;
        } else if (daysReserved >= 5) {
            discountRate = 0.20;
        }

        double total = ROOM_CHARGE * daysReserved * (1 - discountRate);

        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE + "/=");
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + total);
    }
}
