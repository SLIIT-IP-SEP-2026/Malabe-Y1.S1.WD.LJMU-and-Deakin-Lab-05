import java.util.Scanner;

public class IT26102381Lab5Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int fee = 48000;
        final int discount10 = 10;
        final int discount20 = 20;

        int startDate, endDate;

        System.out.print("Enter Start Date (1-31): ");
        startDate = sc.nextInt();
        System.out.print("Enter End Date (1-31): ");
        endDate = sc.nextInt();

        // validate dates
        if ((startDate > 31 || startDate < 1) || (endDate > 31 || endDate < 1)) {
            System.out.println("Error: Days must be between 1 and 11");
            return;
        } else if (startDate > endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int numberOfDays = endDate - startDate;
        double totalFee = fee * numberOfDays;

        // discount logic
        if (numberOfDays >= 3 && numberOfDays < 5) {
            totalFee = totalFee - (totalFee * discount10 / 100.0);
        } else if (numberOfDays > 5) {
            totalFee = totalFee - (totalFee * (discount20 / 100.0));
        }

        System.out.println("\nRoom Charge Per Day: " + fee);
        System.out.println("Number of Days Reserved: " + numberOfDays);
        System.out.println("Total Amount to be paid: " + totalFee);

        sc.close();
    }
}