import java.util.Scanner;
public class IT26102619Lab5Q3{
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		
		final double charges_perd = 48000;
		final double dis_3_To_4D = 0.1;
		final double dis_5_Or_MoreD = 0.2;
		final int min_Days = 1;
		final int max_Days = 31;
		
		System.out.print("Enter Start Date (1-31): ");
		int startD = input.nextInt();
		
		System.out.print("Enter End Date (1-31): ");
		int endD = input.nextInt ();
		
		if (startD < min_Days || startD > max_Days || endD < min_Days || endD > max_Days) {
			System.out.println("Error:  Day must be between 1 and 31 ");
			return;
		}	
		if (startD >= endD){
			System.out.println("Error: Start date must be less than End date");
			return;
		}
		
		int days = endD - startD;
		
		double discountRate = 0;
		
		if ( days >= 3 && days <= 4) {
			discountRate = dis_3_To_4D;
		}
		
		else if ( days >= 5) {
			discountRate = dis_5_Or_MoreD;
		}

		double totalAmount = days * charges_perd;
		double discountAmount = totalAmount * discountRate;
		double amount2paid =  totalAmount - discountAmount;
		
		System.out.println("Room charge per Day: Rs. " + charges_perd + "/=");
		System.out.println("Number of Days Reserved: " + days);
		System.out.println("Total Amount to be paid: " + amount2paid);
		System.out.println("\nThankyou for Visiting ");
	}
}		
		
		