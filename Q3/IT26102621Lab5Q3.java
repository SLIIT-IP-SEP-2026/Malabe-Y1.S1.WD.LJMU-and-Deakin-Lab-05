
import java.util.Scanner;

public class IT26102621Lab5Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        System.out.print("Enter start date: ");
        int startDate = input.nextInt();

        System.out.print("Enter end date: ");
        int endDate = input.nextInt();

        
        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Dates must be between 1 and 31.");
            input.close();
            return;
        }

        
        if (startDate >= endDate) {
            System.out.println(
                "Error: Start date must be less than end date."
            );
            input.close();
            return;
        }

        
        int days = endDate - startDate;

        
        double total = days * ROOM_CHARGE;
        double discountRate = 0;

        if (days >= 3 && days <= 4) {
            discountRate = DISCOUNT_10;
        } else if (days >= 5) {
            discountRate = DISCOUNT_20;
        }

        double discount = total * discountRate;
        double amountToPay = total - discount;

        System.out.println("Number of days reserved: " + days);
        System.out.printf("Room charges: Rs. %.2f%n", total);
        System.out.printf("Discount: Rs. %.2f%n", discount);
        System.out.printf("Total amount to pay: Rs. %.2f%n",
                          amountToPay);

        input.close();
    }
}
