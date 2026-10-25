import java.util.Scanner;
public class IT26102754Lab5Q2 
{
    public static void main(String[] args) 
    {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the amount of new members introduced : ");
        int number = sc.nextInt();
        if (number<0)
        {
            System.out.print("Input number must be greater than 0");
            return;
        }
        
        if (number >=5)
        {
            System.out.print("Prize is a : Headphone");
            return;
        }

        else if (number >=4)
        {
            System.out.print("Prize is a : Travelling Chair");
            return;
        }

        else if (number >=3)
        {
            System.out.print("Prize is a : Bag");
            return;
        }

        else if (number >=2)
        {
            System.out.print("Prize is an : Umbrella");
            return;
        }

        else if (number >=1)
        {
            System.out.print("Prize is a : Pen");
            return;
        }

        else
        {
            System.out.print("No prize");
            return;
        }

    }
}
