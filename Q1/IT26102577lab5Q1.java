import java.util.Scanner;

public class IT26102577lab5Q1{
	
	public static void main(String[] args) 
	{
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number 1: ");
		double num1 = input.nextDouble();
		
		System.out.println("Enter number 2: ");
		double num2 = input.nextDouble();
		
		System.out.println("Enter number 3: ");
		double num3 = input.nextDouble();
		
		double small;
		double large;
		
		if ((num1 > num2)||(num1 > num3))
		{
			large = num1;
		}
		
		if ((num2 > num1)||(num2 > num3))
		{
			large = num2;
		}
		
		if ((num3 > num1)||(num3 > num2))
		{
			large = num3;
		}
		
		if ((num1 < num2)||(num1 < num3))
		{
			small = num1;
		}
		
		if ((num2 < num1)||(num2 < num3))
		{
			small = num2;
		}
		
		if ((num3 < num1)||(num3 < num2))
		{
			small = num3;
		}
		
		System.out.println("The larger number is: "+ large);
		System.out.println("The smaller number is: "+ small);
		
	}
}