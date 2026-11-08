import java.util.Scanner;
 public class IT26102619Lab5Q2{
	 
	 public static void main(String[] args){
	 
	 Scanner input = new Scanner(System.in);
	 
	 System.out.print("Enter the number of new members introduced: ");
	 int newMem = input.nextInt();
	 
	 if (newMem < 0) {
			System.out.println("Input must be a nummber 0 or greater ");
			return;
	
	 }
	 
	 String prize;
	 
	 switch (newMem) {
		case 0:
			prize = "No Price";
			System.out.println("Prize is a: "+ prize);
			break;
			
		case 1:
			prize = "Pen";
			System.out.println("Prize is a: "+ prize);
			break;
			
		case 2:
			prize = "Umbrella";
			System.out.println("Prize is a: "+ prize);
			break;
			
		case 3:
			prize = "Bag";
			System.out.println("Prize is a: "+ prize);
			break;
			
			
		case 4:
			prize = "Travelling Chair";
			System.out.println("Prize is a: "+ prize);
			break;
			
		default:
			prize = "Headphone";
			System.out.println("Prize is a: "+ prize);
			break;
		}	
	}
}