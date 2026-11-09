import java.util.Scanner;
	public class IT26102662Lab5Q2{
	
		public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter The Number Of New Members Introduced: ");
		int numberOfMem = input.nextInt();
		
		if (numberOfMem < 0){
			System.out.println("Input must be a number 0 or greater");
			return;
		}
		
		String prize;
		
		switch (numberOfMem){
			
			case 0:
				prize = "No Prize";
				System.out.println(prize);
				break;
			
			case 1:
				prize = "Pen";
				System.out.println("Prize is: "+ prize);
				break;
				
			case 2:
				prize = "Umbrella";
				System.out.println("Prize is: "+ prize);
				break;
				
			case 3:
				prize = "Bag";
				System.out.println("Prize is: "+ prize);
				break;
			
			case 4:
				prize = "Travelling Chair";
				System.out.println("Prize is: "+ prize);
				break;
			
			default:
				prize = "Headphone";
				System.out.println("Prize is: "+ prize);
				break;
		}
	}	

}		