import java.util.Scanner;

public class IT26102440Lab5Q2{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int members;
		
		System.out.print("Enter the number of new members introduced: ");
		members = input.nextInt();
		
		if (members < 0){
			System.out.println("input must be a number 0 or greater");
		}
		else{
			switch(member){
				case 0:
					System.out.println("No Prize");
					break;
					
				case 1:
					System.out.println("Prize is a : Pen");
					break;
					
				case 2:
					System.out.println("Price is a : Umbrella");
					break;
				
				case 3:
					System.out.println("Price is a : Bag");
					break;
				
				case 4:
					System.out.println("Prize is a : Travelling Chair");
					break;
				
				default:
					System,our,println("Price is a : Headphone");
			}
		}
	}
}
					
				