//An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits.
import java.util.*;
public class Armstrong_number 
{
   public static void main(String args[])
   {
        System.out.print("Enter a number to check that a number is Armstrong number or not:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int digit = 0;
        while(temp>0)
        {
            temp = temp/10;
            digit++;
        }
        temp = num;
        int sum =0;
        while(temp>0)
        {
            int x = temp%10;
            sum = (int) Math.pow(x, digit) + sum;
            temp = temp/10;
        }
        if(sum == num)
        {
            System.out.println("Number is Armstrong");
        }
        else
        {
            System.out.println("Number is not Armstrong");
        }
   } 
}
