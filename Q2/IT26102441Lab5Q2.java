import java.util.Scanner;
public class IT26102441Lab5Q2{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of new members: ");
		int new_members = obj.nextInt();
		if (new_members<0){
			System.out.println("INVALID");
		}
		else{
		switch (new_members){
			case 0:
			System.out.println("No prize");
			break;
			case 1:
			System.out.println("Pen");
			break;
			case 2:
			System.out.println("Umbrella");
			break;
			case 3:
			System.out.println("Bag");
			break;
			case 4:
			System.out.println("Traveling Bag");
			break;
			default:
			System.out.println("Headphone");
			}
		}
	}
}