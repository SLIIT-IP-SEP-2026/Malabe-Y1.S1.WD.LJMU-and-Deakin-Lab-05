import java.util.Scanner;
public class IT26102437Lab5Q2{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of new members introduced: ");
		int members = input.nextInt();
		if (members < 0){
			System.out.println("Input must be a number 0 or greater");
		} else { 
		 switch (members) {
			 case 0 :
			 System.out.println("No Prize"); 
			 break; 
			 
			 case 1 :
			 System.out.println("Price is a pen");
			 break;
			 
			 case 2 : 
			 System.out.println("Price is an Umbrella");
			 break;
			 
			 case 3 : 
			 System.out.println("Prize is a Bag");
			 break;
			 
			 case 4 :
			 System.out.println("Prize is a : Travelling Chair");
			 break;
			 
			 default:		 
			 System.out.println("Prize is a : Headphone");
			
			}
		}
	}	
	
}		