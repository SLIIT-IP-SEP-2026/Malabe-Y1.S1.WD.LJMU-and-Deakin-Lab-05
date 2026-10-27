import java.util.Scanner;
public class IT26102617Lab5Q2{
	public static void main(String[] args){
		
		final double RoomCharge = 48000;
		final int MinDay=1;
		final int MaxDay=31;
		
		Scanner input=new Scanner (System.in);
		
		Scanner.out.print("Enter Start Date(1-31):");
		int startDate=input.nextInt();
				
		Scanner.out.print("Enter End Date(1-31):");
		int endDate=input.nextInt();
		
		if ((startDate<MinDay || startDate>MaxDay)||(endDate<MinDay || (endDate>MaxDay))
		{
		System.out.println("Days must be between 1 and 31");
		}
		
		if (startDate>=endDate)
		{
		System.out.println("Start Date must be less than End Date");
		}
		
		System.out.print("Room Charge Per day: "+RoomCharge);
		
		int DaysReserved=(endDate-startDate);
		System.out.println("Number of days Reserved: " + DaysReserved)
		
		double TotalAmount=(DaysReserved*RoomCharge);
		System.out.println("Total Amount to be Paid: "+TotalAmount);
		
	}
}

		

		
		

		


			
		
		
		