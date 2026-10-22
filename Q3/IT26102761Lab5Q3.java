import java.util.Scanner;

public class IT26102761Lab5Q3 {
    public static void main(String[] args) {
        final double ROOM_CHARGE = 48000.00;  // constant room charge per day
        Scanner input = new Scanner(System.in);

        System.out.print("Enter start date (1–31): ");
        int start = input.nextInt();

        System.out.print("Enter end date (1–31): ");
        int end = input.nextInt();

        // validation
        if (start < 1 || start > 31 || end < 1 || end > 31) {
            System.out.println("Error: Dates must be between 1 and 31");
        } else if (start >= end) {
            System.out.println("Error: Start date must be less than end date");
        } else {
            int days = end - start; // corrected: no +1
            double discountRate = 0.0;

            if (days < 3) {
                discountRate = 0.0;
            } else if (days <= 4) {
                discountRate = 0.10;
            } else {
                discountRate = 0.20;
            }

            double total = ROOM_CHARGE * days;
            double discount = total * discountRate;
            double finalAmount = total - discount;

            System.out.println("Room charge per day: Rs. " + ROOM_CHARGE);
            System.out.println("Number of days reserved: " + days);
            System.out.println("Discount rate: " + (discountRate * 100) + "%");
            System.out.println("Total amount to be paid: Rs. " + finalAmount);
        }
    }
}
