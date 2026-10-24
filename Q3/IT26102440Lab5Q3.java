import java.util.Scanner;

public class IT26102440Lab5Q3{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		final double ROOM_CHARGE = 48000.00
		final double DISCOUNT1 = 0.10;
		final double DISCOUNT2 = 0.20;
		
		int startDate, endDate, days;
		double total, discount = 0;
		
		System.out.print("Enter Start Date (1-31): ");
		startDate = input.nextInt();
		
		System.out.print("Enter End Date (1-31): ");
		endDate = input.nextInt();
		
		if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31){
			
			System.out.println("Error: Days must be between 1 and 31");
		}
		else if (startDate >= endDate){
			
			System.out.println("Error: Start Date must be less than End Date");
		}
		else{
			days = endDate - startDate;
			
			if (days >= 5){
				discount = DISCOUNT2;
			}
			else if (days >= 3){
				discount = DISCOUNT1;
			}
			
			total = days * ROOM_CHARGE;
			total = total - (total * discount);
			
			System.out.println("Room charge per day: Rs. " + ROOM_CHARGE + "/=");
			System.out.println("Number of Days Reserved: " + days);
			System.out.println("Total Amount to be Paid: " + total);
			
		}
	}
}