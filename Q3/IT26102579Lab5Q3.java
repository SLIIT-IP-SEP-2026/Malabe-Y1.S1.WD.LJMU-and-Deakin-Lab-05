import java.util.Scanner;

public class IT26102579Lab5Q3{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		final double ROOM_CHARGE = 48000.00;
		final double DISCOUNT_10_PERCENT = 10.0/100;
		final double DISCOUNT_20_PERCENT = 20.0/100;
		
		int startDate;
		int endDate;
		int numOfDays;
		
		double  discount = 0;
		double totalAmount;
		
		
		System.out.print("Enter Start Date (1-31): ");
		startDate = input.nextInt();
		
		System.out.print("Enter End Date (1-31): ");
		endDate = input.nextInt();
		
		if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
			System.out.print("Days must be between 1 and 31");
			return;
		}
		if (startDate >= endDate) {
			System.out.println("Start Date must be less than End Date");
			return;
		}
		
		numOfDays  = endDate - startDate;
		
		if (numOfDays >= 5) {
			discount = DISCOUNT_20_PERCENT;
		}
		else if (numOfDays >= 3) {
			discount = DISCOUNT_10_PERCENT;
		}
		
		totalAmount  = ROOM_CHARGE * numOfDays;
		totalAmount = totalAmount - (totalAmount * discount);
		
		System.out.println("\nRoom Charge per Day: Rs." + ROOM_CHARGE);
		System.out.println("Number of Days Reserved: " + numOfDays);
		System.out.println("Total Amount to be Paid: " + totalAmount);
	}
}