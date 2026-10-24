import java.util.Scanner;
public class IT26102660Lab5Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int Num1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        int Num2 = input.nextInt();
        System.out.print("Enter the third integer: ");
        int Num3 = input.nextInt();

        System.out.println("\nUser entered numbers are : " + Num1 + " " + Num2 + " " + Num3);

        int Smallest = Num1;
        if (Num2 < Smallest) {
            Smallest = Num2;
        }
        if (Num3 < Smallest) {
            Smallest = Num3;
        }

        int Largest = Num1;
        if (Num2 > Largest) {
            Largest = Num2;
        }
        if (Num3 > Largest) {
            Largest = Num3;
        }

        System.out.println("The Smallest number is: " + Smallest);
        System.out.println("The Largest number is: " + Largest);
    }
}
