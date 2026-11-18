import java.util.Scanner;

public class IT26102752Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.0;

        System.out.print("Enter Start Date: ");
        int start = sc.nextInt();

        System.out.print("Enter End Date: ");
        int end = sc.nextInt();

        if (start < 1 || start > 31 || end < 1 || end > 31) {
            System.out.println("Invalid Date");
            return;
        }

        if (start >= end) {
            System.out.println("Start date must be less than End date");
            return;
        }

        int days = end - start;
        double amount = days * ROOM_CHARGE;

        if (days >= 5)
            amount = amount * 0.80; // 20% discount
        else if (days >= 3)
            amount = amount * 0.90; // 10% discount

        System.out.println("Days Reserved = " + days);
        System.out.println("Total Amount = Rs." + amount);
    }
}