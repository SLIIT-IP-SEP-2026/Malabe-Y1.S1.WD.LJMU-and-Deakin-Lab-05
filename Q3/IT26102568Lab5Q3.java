import java.util.Scanner;

public class IT26102568Lab5Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double roomCharge = 48000;

        System.out.print("Enter start day: ");
        int startDay = input.nextInt();

        System.out.print("Enter end day: ");
        int endDay = input.nextInt();

        if (startDay < 1 || startDay > 31 || endDay < 1 || endDay > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        if (startDay >= endDay) {
            System.out.println("Error: Start day must be less than end day");
            return;
        }

        int days = endDay - startDay;

        double total = days * roomCharge;
        double discount = 0;

        if (days >= 3 && days <= 4) {
            discount = total * 0.10;
        }
        else if (days >= 5) {
            discount = total * 0.20;
        }

        double amountToPay = total - discount;

        System.out.println("Number of days reserved: " + days);
        System.out.println("Discount: Rs." + discount);
        System.out.println("Amount to pay: Rs." + amountToPay);

        input.close();
    }
}