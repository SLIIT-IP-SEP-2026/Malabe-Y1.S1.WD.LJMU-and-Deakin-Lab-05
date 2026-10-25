import java.util.Scanner;

public class IT26102754Lab5Q3 
{
  public static void main(String[] args) 
  {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter start date : ");
      int start_date = sc.nextInt();

      if(start_date>31 || start_date<0)
      {
        System.out.println("Days must be between 1 and 31");
        return;
      }

      System.out.print("Enter end date : ");
      int end_date = sc.nextInt();

      if(end_date>31 || end_date<0)
      {
        System.out.println("Days must be between 1 and 31");
        return;
      }

      if (end_date<start_date)
      {
        System.out.println("Start date must be less than End date");
        return;
      }

      final int amountPerDay = 48000;


      int numOfDays = end_date-start_date;
      double discount = 0;
      {
        if (numOfDays>=5)
      {
        discount= discount + 0.2;
      }
      else if (numOfDays>=3)
      {
        discount = discount + 0.1;
      }
      else 
      {
        
      }
      double amountOfDays = end_date-start_date;
      double finalAmount = (amountPerDay*amountOfDays)*(1-discount);
      System.out.println("Amount charged per day : " + amountPerDay);
      System.out.println("Number of days reserved : " + numOfDays);
      System.out.println("Total Amount to be Paid : " + finalAmount);
    }
  }  
}
