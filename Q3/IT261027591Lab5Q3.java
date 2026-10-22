import java.util.Scanner;

public class IT261027591Lab5Q3 {
    
    public static void main(String[] args) {

        final double ROOM_CHARGE = 48000.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        // Validation 1
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        // Validation 2
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than End Date");
            return;
        }

        int daysReserved = endDate - startDate;

        double discountRate = 0;

        if (daysReserved >= 5) {
            discountRate = 20;
        } else if (daysReserved >= 3) {
            discountRate = 10;
        }

        double totalAmount =
                (daysReserved * ROOM_CHARGE)
                - ((daysReserved * ROOM_CHARGE) * discountRate / 100);

        System.out.println("\nRoom Charge Per Day: Rs. " + ROOM_CHARGE + "/=");
        System.out.println("Number Of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmount);

        input.close();
    }
}