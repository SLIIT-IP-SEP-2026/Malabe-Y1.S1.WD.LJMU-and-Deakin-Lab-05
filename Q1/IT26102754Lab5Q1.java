import java.util.Scanner;

public class IT26102754Lab5Q1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int value_1 = sc.nextInt();
        
        System.out.print("Enter number 2 : ");
        int value_2 = sc.nextInt();
        
        System.out.print("Enter number 3 : ");
        int value_3 = sc.nextInt();

        System.out.println("User entered numbers are : " + value_1 + " " + value_2 + " " + value_3);
        
        int smallest = value_1;
        int biggest = value_1;

        if ( value_2<smallest)
        {
            smallest = value_2;
        }
        if (value_3<smallest)
        {
            smallest = value_3;
        }

        if ( value_2>biggest)
        {
            biggest = value_2;
        }
        if (value_3>biggest)
        {
            biggest = value_3;
        }

        System.out.println("The smallest number is : " + smallest);
        System.out.println("The largest number is : " + biggest);

    }
}
