import java.util.Scanner;

public class IT26102576Lab5Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double roomCharge = 48000.00;
        double discount10 = 0.10;
        double discount20 = 0.20;

        double totalAmount, discount = 0;

        System.out.print("Enter start date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter end date(1-31): ");
        int endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {

            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date.");
            return;
        }

        int daysReserved = endDate - startDate;

        if (daysReserved >= 3 && daysReserved <= 4) {
            discount = discount10;
        } else if (daysReserved >= 5) {
            discount = discount20;
        }

        totalAmount = daysReserved * roomCharge;
        totalAmount = totalAmount - (totalAmount * discount);

		System.out.println();
		System.out.println("Room Charges Per Day: " + roomCharge);
        System.out.println("Number of days reserved: " + daysReserved);
        System.out.printf("Total amount to be paid: " + totalAmount);

    }
}