import java.util.Scanner;
 
public class IT26102468Lab5Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter the first integer: ");
        int a = input.nextInt();
 
        System.out.print("Enter the second integer: ");
        int b = input.nextInt();
 
        System.out.print("Enter the third integer: ");
        int c = input.nextInt();
 
        int smallest = a;
        int largest = a;
 
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;
 
        if (b > largest) largest = b;
        if (c > largest) largest = c;
 
        System.out.println();
        System.out.println("User entered numbers are : " + a + " " + b + " " + c);
        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);

    }
}