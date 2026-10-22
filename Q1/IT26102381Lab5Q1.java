import java.util.Scanner;

public class IT26102381Lab5Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1, num2, num3;

        System.out.print("Enter the first integer: ");     num1 = sc.nextDouble();
        System.out.print("Enter the second integer: ");    num2 = sc.nextDouble();
        System.out.print("Enter the third integer: ");     num3 = sc.nextDouble();

        System.out.println("\nUser entered numbers are: " + num1 + " | " + num2 + " | " + num3);

        double[] numArray = {num1, num2, num3};

        double min_value = numArray[0];
        double max_value = numArray[0];
        for (int i=0; i < numArray.length; i++) {
            min_value = Math.min(min_value, numArray[i]);
            max_value = Math.max(max_value, numArray[i]);
        }

        System.out.println("\nThe smallest number is: " + min_value);
        System.out.println("The largest nubmer is: " + max_value);

        sc.close();
    }
}