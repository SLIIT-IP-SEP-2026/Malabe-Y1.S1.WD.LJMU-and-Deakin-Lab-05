import java.util.Scanner;

public class IT26102381Lab5Q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numOfMembers;

        System.out.print("Enter the number of new members introduced: ");
        numOfMembers = sc.nextInt();

        String displayMsg = "Prize is a ";

        // handle case 5 since it's a special case
        if (numOfMembers >= 5) {
            displayMsg += "Headphone";
        } else {
            switch(numOfMembers) {
                case 0: {
                    displayMsg = "No Prize";
                    break;
                }
                case 1: {
                    displayMsg += "Pen";
                    break;
                }
                case 2: {
                    displayMsg += "Umbrella";
                    break;
                }
                case 3: {
                    displayMsg += "Bag";
                    break;
                }
                case 4: {
                    displayMsg += "Travelling Chair";
                    break;
                }
                default: {
                    displayMsg = "Input must be a number 0 or greater";
                }
            }
        }

        System.out.println(displayMsg);

        sc.close();
    }
}