import java.util.Scanner;

public class IT26102618Lab5Q2{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of new members introduced: ");
		int memberNum = input.nextInt();
		
		if(memberNum<0){
			System.out.println("Input must be a number 0 or greater");
			return;
		}
		
		switch(memberNum){
			case 0: System.out.println("No Prize");
			break;
			
			case 1: System.out.println("Prize is a: Pen");
			break;
			
			case 2: System.out.println("Prize is a: Umberella");
			break;
			
			case 3: System.out.println("Prize is a: Bag");
			break;
			
			case 4: System.out.println("Prize is a: Travelling chair");
			break;
			
			default:
				if(memberNum>=5){
					System.out.println("Prize is a: Headphone");
				}
		}
		
		
	}


}