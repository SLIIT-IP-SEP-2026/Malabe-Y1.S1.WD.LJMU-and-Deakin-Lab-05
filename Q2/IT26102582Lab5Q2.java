import java.util.Scanner;

public class IT26102582Lab5Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int members;
		int prizeCategory;

        System.out.print("Enter the number of new members introduced: ");
        members = input.nextInt();
		
		System.out.println();

        if (members < 0) {
            System.out.println("Input must be a number 0 or greater");
            return;
        }

        if (members >= 5) {
            prizeCategory = 5;
        } else {
            prizeCategory = members;
        }

        switch (prizeCategory) {

            case 0:
                System.out.println("No Prize");
                break;

            case 1:
                System.out.println("Prize is a : Pen");
                break;

            case 2:
                System.out.println("Prize is a : Umbrella");
                break;

            case 3:
                System.out.println("Prize is a : Bag");
                break;

            case 4:
                System.out.println("Prize is a : Travelling Chair");
                break;

            case 5:
                System.out.println("Prize is a : Headphone");
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}