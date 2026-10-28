import java.util.Scanner;
public class IT26102437Lab5Q1{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first integer: ");
		int number1 = input.nextInt();
		System.out.println("Enter the second integer: ");
		int number2 = input.nextInt();
		System.out.println("Enter the third integer: ");
		int number3 = input.nextInt();
		
		int max;
		int min; 
		
		if (number1 >= number2 && number1 >= number3){
			max = number1;
			
		} else if (number2 <= number1&& number2 <= number3) {
			max = number2;
		} else { 
		   max = number3;
		} 
		 
		 if (number1 <= number2 && number1 <= number3) {
		    min = number1; 
			 
		 } else if (number2 <= number1 && number2 <= number3) { 
		   min = number2;
		 } else {
		   min = number3;
		 }
		 
		System.out.println("User entered numbers are : " + number1 + " " + number2 + " " + number3);
        System.out.println("The Smallest number is: " + min);
        System.out.println("The Largest number is: " + max);
	}
}
