import java.util.Scanner;
public class IT26102437Lab5Q3{
	final double ROOM_CHARGE_PER_DAY = 48000.0;
	final double DISCOUNT_3_TO_4 = 10.0;
	final double DISCOUNT_5_OR_MORE = 20.0;

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the start date (1-31): "); 
		startDate = input.nextInt();
		
		System.out.println("Enter the end date (1-31):  ");
		endDate = input.nextInt();
		
		// validation 1 days must be between 1 and 31
		if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
			System.out.println("Error: Days must be between 1 and 31");
            return; 
		}
          // validation 2 start date must be less than end date
		  if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
			
		// days reserved 
		int daysReserved = endDate - startDate;
		
		double discountRate = 0.0;
		if (daysReserved >= 5) {
			DiscountRate = DISCOUNT_5_OR_MORE;
			
		} else if (daysReserved >= 3) {
			DiscountRate = DISCOUNT_3_TO_4;
		}
		
		// calculate total amount
		double totalCost = daysReserved * ROOM_CHARGE_PER_DAY;
        double discountAmount = totalCost * (discountRate / 100.0);
        double totalAmountToBePaid = totalCost - discountAmount;
	    
		System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY );
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmountToBePaid);
	
	
     }
	
	
	
	
	
} 