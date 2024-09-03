//A palindrome number is a number that is same after reverse.
import java.util.*;
public class Palindrome 
{
    public static void main(String args[])   
    {
        System.out.print("Enter a number to check it is Palindrome or not:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int real = num; //to store number so that i can check at th end
        int y = 0;
        while(num>0) // To reverse a number
        {
                int x = (num)%10;
                y = (y*10) +x;
                num = num/10;
        }
        if(real == y)//to check number with reverse number 
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is not Palindrome");
        }
        sc.close();
    } 
}
