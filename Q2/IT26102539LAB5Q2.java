import java.util.Scanner;

public class IT26102539LAB4 {
    public static void main(String [] args ) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter The Number: ");
		double num = input.nextDouble();
		
		if (num > 0){
        System.out.println("The Number Is: Negative");
        }else if (num < 0){
		System.out.println("The Number Is: Positive");
		}else {
			System.out.println("The Number Is Zero");
		}
	}
}
	