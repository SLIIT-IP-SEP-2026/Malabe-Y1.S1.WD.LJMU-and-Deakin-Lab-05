import java.util.Scanner;

public class IT26102661Lab5Q3{
	
	public static void main (String [] args){
		
		final double  ROOM_CHARGE_PER_DAY = 48000;
		final double  DISCOUNT_3_TO_4_DAYS = 0.1;
		final double  DISCOUNT_5_OR_MORE_DAYS = 0.2;
		final int  MIN_DAYS = 1;
		final int MAX_DAYS = 31;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Start Date (1-31): ");
		int startDate = input.nextInt();
		
		System.out.print("Enter End Date (1-31): ");
		int endDate = input.nextInt();
		
		if (startDate < MIN_DAYS || startDate > MAX_DAYS || endDate < MIN_DAYS || endDate > MAX_DAYS){
			System.out.println("Error : Days must be between 1 and 31");
			return;
			
		}
		if (startDate >= endDate){
			System.out.println("Error : Start date must be less than End date");
			return;
			
		}
		
		int noOfDays = endDate - startDate;
		
		double discountRate = 0;
		
		if (noOfDays >= 3 && noOfDays <= 4){
			discountRate = DISCOUNT_3_TO_4_DAYS;
			
		}else if (noOfDays >= 5){
			discountRate = DISCOUNT_5_OR_MORE_DAYS;
			
		}
		
		double totalAmount = noOfDays * ROOM_CHARGE_PER_DAY;
		double discountAmount = totalAmount * discountRate;
		double amountToBePaid = totalAmount - discountAmount;
		
		System.out.println("Room charge per day Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
		System.out.println("Number of Days Reserved: " + noOfDays);
		System.out.println("Total Amount to be paid: " + amountToBePaid); 
		
		
		
		
		
	}
	
	
}