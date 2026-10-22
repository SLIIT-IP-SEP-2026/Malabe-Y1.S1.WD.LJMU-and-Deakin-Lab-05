import java.util.Scanner;

public class IT26102783Lab5Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of new members introduced: ");
        int members = sc.nextInt();
        
        if (members < 0) {
            System.out.println("Input must be a number 0 or greater");
            sc.close();
            return;
        }
        
        String prize;
        switch (members) {
            case 0:
                prize = "No Prize";
                break;
            case 1:
                prize = "Pen";
                break;
            case 2:
                prize = "Umbrella";
                break;
            case 3:
                prize = "Bag";
                break;
            case 4:
                prize = "Travelling Chair";
                break;
            default:
                prize = "Headphone";
                break;
        }
        
        System.out.println("\nPrize is a : " + prize);
        
        sc.close();
    }
}