import java.util.Scanner;

public class IT26102582Lab5Q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		int firstInteger = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		int secondInteger = input.nextInt();
		
		System.out.print("Enter the third integer: ");
		int thirdInteger = input.nextInt();
		
		System.out.println();
		System.out.println("User entered numbers are : " + " " + firstInteger + " " + secondInteger + " " + thirdInteger);
		
		int smallest = firstInteger;
		
		if ( secondInteger < smallest ) {
		smallest = secondInteger; }
		
		if ( thirdInteger < smallest ) {
		smallest = thirdInteger; }
		
		System.out.println("The Smallest number is: " + smallest);
		
		int largest = firstInteger;
		
		if ( secondInteger > largest ) {
		largest = secondInteger; }
		
		if ( thirdInteger > largest ) {
		largest = thirdInteger; }
		
		System.out.println("The largest number is: " + largest);
		
	}
}