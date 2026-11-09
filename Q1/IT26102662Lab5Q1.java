import java.util.Scanner;
	public class IT26102662Lab5Q1{
		public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter first integer: ");
		int firstNum =input.nextInt();
		
		System.out.print("Enter second integer: ");
		int secondNum =input.nextInt();
		
		System.out.print("Enter third integer: ");
		int thirdNum =input.nextInt();
		
		int largest = firstNum;
		int smallest = firstNum;
		
		if (secondNum > largest){
			largest = secondNum;
		}
		if (thirdNum > largest){
			largest = thirdNum;
		}
		if (secondNum < smallest){
			smallest = secondNum;
		}
		if (thirdNum < smallest){
			smallest = thirdNum;
		}
			
		System.out.println("User entered numbers are: " + firstNum + " " + secondNum + " " + thirdNum);
		System.out.println("Smallest Number Is: " + smallest);
		System.out.println("Largest Number Is: " + largest);
	}
}