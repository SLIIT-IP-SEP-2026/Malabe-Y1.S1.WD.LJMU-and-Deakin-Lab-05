import java.util.Scanner;

public class IT26102722Lab5Q3 {

    public static void main(String[] args) {

        final double ROOM_CHARGE = 48000.00;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31) : ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31) : ");
        int endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Dates must be between 1 and 31");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date should be less than End Date");
            return;
        }

        int days = endDate - startDate;

        double totalAmount;
        double discount = 0;

        if (days >= 5) {
            discount = 20;
        } else if (days >= 3) {
            discount = 10;
        }

        totalAmount = days * ROOM_CHARGE;
        totalAmount = totalAmount - (totalAmount * discount / 100);
		
		
        System.out.println("Room Charge per day : " + ROOM_CHARGE );
        System.out.println("Number of Days Reserved : " + days); 
        System.out.println("Total Amount to be Paid : Rs." + totalAmount);

        input.close();
    }
}
	
