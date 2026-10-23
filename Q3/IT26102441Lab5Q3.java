import java.util.Scanner;
public class IT26102441Lab5Q3{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		final double room_chrge_per_day = 48000; 
		System.out.println("enter the start date: ");
		int start_date = obj.nextInt();
		System.out.println("enter the end date: ");
		int end_date = obj.nextInt();
		if (start_date < 1 | start_date > 31){
			System.out.println("your start date is invalid");
			return;
		}
		if (end_date < 1 | end_date > 31){
			System.out.println("your end date is invalid");
			return;
		}
		int no_of_dates;
		if (start_date!=end_date){
		    no_of_dates=end_date-start_date;
			System.out.println("The number of dates: "+no_of_dates);
		}else {
			System.out.println("invalid");
			return;
		}
		double discount_rate;
		if (no_of_dates>=5){
			discount_rate=20/100;
		}else if(no_of_dates>=3){
			discount_rate=10/100;
		}else{
			discount_rate=0;
		}
		final double full_charge = room_chrge_per_day * no_of_dates * discount_rate;
		
		System.out.println("Your full charge is: "+full_charge);
		
		
	}
}