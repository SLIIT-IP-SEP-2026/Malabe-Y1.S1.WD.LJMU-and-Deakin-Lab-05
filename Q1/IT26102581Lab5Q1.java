import java.util.Scanner;

public class IT26102581Lab5Q1 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3;
        int largest, smallest;

        System.out.print("Enter first integer: ");
        num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        num2 = input.nextInt();

        System.out.print("Enter third integer: ");
        num3 = input.nextInt();

        largest = num1;

        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

        smallest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }

        if (num3 < smallest) {
            smallest = num3;
        }

        System.out.println("\nLargest Number = " + largest);
        System.out.println("Smallest Number = " + smallest);
	}
}