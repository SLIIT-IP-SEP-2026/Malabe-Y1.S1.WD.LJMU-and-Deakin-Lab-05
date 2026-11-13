
public class IT26102758Lab5Q3 {

    public static void main(String[] args) {

        final double ROOM_CHARGE_PER_DAY = 48000.00;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        // Validation 1
        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        // Validation 2
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int noOfDays = endDate - startDate;

        double discountRate = 0;

        if (noOfDays >= 3 && noOfDays <= 4) {
            discountRate = 10;
        } else if (noOfDays >= 5) {
            discountRate = 20;
        }

        double totalCharge = noOfDays * ROOM_CHARGE_PER_DAY;
        double discountAmount = totalCharge * (discountRate / 100);
        double finalAmount = totalCharge - discountAmount;

        System.out.println("\nRoom Charge Per Day: Rs. "
                + ROOM_CHARGE_PER_DAY);

        System.out.println("Number of Days Reserved: "
                + noOfDays);

        System.out.println("Total Amount to be Paid: Rs. "
                + finalAmount);

        input.close();
    }
}