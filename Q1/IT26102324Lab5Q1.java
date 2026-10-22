import java.util.Scanner;

public class IT26102324Lab5Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first integer: ");
        int a = sc.nextInt();
        
        System.out.print("Enter the second integer: ");
        int b = sc.nextInt();
        
        System.out.print("Enter the third integer: ");
        int c = sc.nextInt();
        
        // Find smallest and largest
        int smallest = a;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;
        
        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;
        
        System.out.println("\nUser entered numbers are : " + a + " " + b + " " + c);
        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);
    }
}