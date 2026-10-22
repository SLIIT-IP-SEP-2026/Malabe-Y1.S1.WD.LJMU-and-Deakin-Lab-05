import java.util.Scanner;

public class IT26102324Lab5Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of new members introduced: ");
        int newMembers = sc.nextInt();
        
        // Validation
        if (newMembers < 0) {
            System.out.println("Input must be a number 0 or greater");
            return;
        }
        
        System.out.print("Prize is a : ");
        
        switch (newMembers) {
            case 0:
                System.out.println("No Prize");
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
                System.out.println("Travelling Chair");
                break;
            default: // >= 5
                System.out.println("Headphone");
                break;
        }
    }
}