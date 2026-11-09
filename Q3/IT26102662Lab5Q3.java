import java.util.Scanner;
	public class IT26102662Lab5Q3{
	
		public static void main (String [] args){
			
			final double ROOM_CHARGE_PER_DAY = 48000;
			final double DISCOUNT_FOR_3_TO_4_DAYS = 0.1;
			final double DISCOUNT_FOR_5_OR_MORE_DAYS = 0.2;
			final int MINIMUM_DAYS = 1;
			final int MAXIMUM_DAYS = 31;
			
			Scanner input = new Scanner (System.in);
		
			System.out.print("Enter Start Date (1-31): ");
			int startDate = input.nextInt();
			System.out.print("Enter End Date (1-31): ");
			int endDate = input.nextInt();
			
			if(startDate > MAXIMUM_DAYS ||startDate < MINIMUM_DAYS || endDate > MAXIMUM_DAYS || endDate < MINIMUM_DAYS){
				System.out.print("Error: Days must be between 1 and 31");
				return;
			}
			
			if(startDate >= endDate){
				System.out.print("Error: Start date should be less than the end date");
				return;
			}
		
			int numOfReserevedDays = endDate - startDate;
			double discountRate = 0;
			
			if(numOfReserevedDays > 3 && numOfReserevedDays <=4){
				discountRate = DISCOUNT_FOR_3_TO_4_DAYS;
			}
			else if (numOfReserevedDays >=5){
				discountRate = DISCOUNT_FOR_5_OR_MORE_DAYS;
			}
			
			double totalAmount = ROOM_CHARGE_PER_DAY * numOfReserevedDays;
			double discountAmount = totalAmount * discountRate;
			double totalAmoutPay = totalAmount - discountAmount;
			
			System.out.println("Room Charge Per Day: "+ROOM_CHARGE_PER_DAY + "/=");
			System.out.println("Number Of Days Reserved: " + numOfReserevedDays);
			System.out.println("Total Amount To Be Paid: " + totalAmoutPay);
		
	}	

}		