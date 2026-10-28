import java.util.Scanner;

public class IT26102618Lab5Q3 {

    public static void main(String[] args) {

        final double ROOM_CHARGE_PER_DAY = 48000.00;
        final int NO_DISCOUNT_DAYS = 3;
        final double DISCOUNT_10 = 10.0;
        final double DISCOUNT_20 = 20.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

      
        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }


      
        int daysReserved = endDate - startDate;

        double discountRate;

        if (daysReserved <= NO_DISCOUNT_DAYS) {
            discountRate = 0;
        } else if (daysReserved <= 4) {
            discountRate = DISCOUNT_10;
        } else {
            discountRate = DISCOUNT_20;
        }

        
        double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;

        double discountAmount = totalAmount * discountRate / 100;

        double finalAmount = totalAmount - discountAmount;

      
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY);

        System.out.println("Number of Days Reserved: " + daysReserved);

        System.out.println("Total Amount to be Paid: Rs. " + finalAmount);

    }
}
