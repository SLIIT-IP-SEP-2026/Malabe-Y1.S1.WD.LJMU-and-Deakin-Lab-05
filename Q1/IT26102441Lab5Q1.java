import java.util.Scanner;
public class IT26102441Lab5Q1{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the first integer: ");
		int first_int = obj.nextInt();
		System.out.println("Enter the second integer: ");
		int second_int = obj.nextInt();
		System.out.println("Enter the third integer: ");
		int third_int = obj.nextInt();
		System.out.println("User enterd numbers are: "+first_int+" "+second_int+" "+third_int);
		int smallest = first_int;
		if (second_int < smallest){
			smallest = second_int;
		}
		if (third_int < smallest){
			smallest = third_int;
		}
		System.out.println("The smallest number is: "+smallest);
		int largest = first_int;
		if (second_int > largest){
			largest = second_int;
		}
		if (third_int > largest){
			largest = third_int;
		}
		System.out.println("The largest number is: "+largest);
	}	
	
	
}