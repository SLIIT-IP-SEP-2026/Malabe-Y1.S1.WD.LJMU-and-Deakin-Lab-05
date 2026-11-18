import java.util.Scanner;

public class IT26102753Lab5Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int largest = a;
        int smallest = a;

        if (b > largest) largest = b;
        if (c > largest) largest = c;

        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}