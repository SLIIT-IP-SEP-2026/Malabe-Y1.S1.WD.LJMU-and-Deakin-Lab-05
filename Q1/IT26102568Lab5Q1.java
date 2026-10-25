
import java.util.Scanner;

public class IT26102568Lab5Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number One: ");
        int num1 = input.nextInt();
        System.out.println("Number One is: " + num1);

        System.out.print("Enter a number Two: ");
        int num2 = input.nextInt();
        System.out.println("Number Two is: " + num2);

        System.out.print("Enter a number Three: ");
        int num3 = input.nextInt();
        System.out.println("Number Three is: " + num3);

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Number One Highest: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Number Two Highest: " + num2);
        } else {
            System.out.println("Number Three Highest: " + num3);
        }
    }
}
