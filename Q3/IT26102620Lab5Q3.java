import java.util.Scanner;

public class IT26102620Lab5Q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        final double PRICE = 48000;

        System.out.print("Enter Start Date (1-31): ");
        int start = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int end = input.nextInt();

        if (start < 1 || start > 31 || end < 1 || end > 31) {
            System.out.println("Error: Days must be between 1 and 31");
        }
        else if (start >= end) {
            System.out.println("Error: Start Date must be less than End Date");
        }
        else {
            int days = end - start;
            double total = days * PRICE;

            if (days >= 5) {
                total = total * 80 / 100;
            }
            else if (days >= 3) {
                total = total * 90 / 100;
            }

            System.out.println("Room Charge Per Day: Rs. " + PRICE);
            System.out.println("Number of Days Reserved: " + days);
            System.out.println("Total Amount to be Paid: " + total);
        }
    }
}

		