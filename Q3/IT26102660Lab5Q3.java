import java.util.Scanner;

public class IT26102660Lab5Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double RoomCharge = 48000.0;

        System.out.print("Enter Start Date (1-31): ");
        int StrtDate = input.nextInt();
        System.out.print("Enter End Date (1-31): ");
        int EndDate = input.nextInt();

        if (StrtDate < 1 || StrtDate > 31 || EndDate < 1 || EndDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }
        if (StrtDate >= EndDate) {
            System.out.println("Error: Start Date must be less than end date");
            return;
        }

        int Days = EndDate - StrtDate;
        double Tot = Days * RoomCharge;

        if (Days >= 5) {
            Tot = Tot - (Tot * 0.20);
        } else if (Days >= 3) {
            Tot = Tot - (Tot * 0.10);
        }

        System.out.println();
        System.out.println("Room Charge Per Day: Rs. " + RoomCharge + "/=");
        System.out.println("Number of Days Reserved: " + Days);
        System.out.println("Total Amount to be Paid: " + Tot);
    }
}
