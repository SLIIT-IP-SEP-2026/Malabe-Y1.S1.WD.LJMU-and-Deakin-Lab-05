import java.util.Scanner;
public class IT26102619Lab5Q1{
	public static void main(String[] args){
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		int first= input.nextInt();
		
		System.out.print("Enter the second integer: ");
		int second= input.nextInt();
		
		System.out.print("Enter the third integer: ");
		int third= input.nextInt();
		
		int smallest = first;
		int largest = first;
		
		// To find the smallest integer
		
		if (second < smallest) {
			smallest = second;
		}
		
		if (third < smallest) {
			smallest = third;
		}
		
		// To find the largest integer
		
		if (second > largest) {
			largest = second;
		}
		
		if (third > largest) {
			largest = third;
		}
		
		System.out.println("\nUser entered numbers are: " + first + " " + second + " " + third);
		System.out.println("The Smallest number is: " + smallest);		
		System.out.println("The largest number is: " + largest);
	}
}