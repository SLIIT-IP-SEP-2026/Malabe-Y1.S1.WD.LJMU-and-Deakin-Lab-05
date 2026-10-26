import java.util.Scanner;

public class ITxxxxxxxxLab5Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final double ROOM_CHARGE = 48000.0;
        final double DISCOUNT_10 = 10;
        final double DISCOUNT_20 = 20;
		
        System.out.print("Enter Start Date (1-31): ");
        int start = sc.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int end = sc.nextInt();

        if (start < 1 || start > 31 || end < 1 || end > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            System.exit(0);
        }

        if (start >= end) {
            System.out.println("Error: Start Date must be less than End Date");
            System.exit(0);
        }
        int days = end - start;
        double total = ROOM_CHARGE * days;
        if (days >= 5) {
            total = total - (total * DISCOUNT_20 / 100);
        } else if (days >= 3) {
            total = total - (total * DISCOUNT_10 / 100);
        }
        System.out.println();
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE + "/=");
        System.out.println("Number of Days Reserved: " + days);
        System.out.println("Total Amount to be Paid: " + total);
    }
}