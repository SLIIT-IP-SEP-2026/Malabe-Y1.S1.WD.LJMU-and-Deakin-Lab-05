import java.util.Scanner;

public class IT26102580Lab5Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double roomCharge = 48000.00;
        final double discount3_to_4Days = 10.0;
        final double discount5_or_More = 20.0;

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println(
                "Error: Days must be between 1 and 31");
            input.close();
            return;
        }

        if (startDate >= endDate) {
            System.out.println(
                "Error: Start Date must be less than End Date");
            input.close();
            return;
        }

        int daysReserved = endDate - startDate;

        double discountRate = 0.0;

        if (daysReserved >= 5) {
            discountRate = discount5_or_More;
        } else if (daysReserved >= 3) {
            discountRate = discount3_to_4Days;
        }

        double totalAmount =
            daysReserved * roomCharge;

        double discountAmount =
            totalAmount * discountRate / 100;

        totalAmount = totalAmount - discountAmount;

        System.out.println();
        System.out.println("Room Charge Per Day: Rs. " + roomCharge + "/=");
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmount);

        input.close();
    }
}
