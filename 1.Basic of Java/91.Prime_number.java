//Prime number is a number that is greater than 1 and divided by 1 or itself only.
import java.util.*;
public class Prime_number 
{
    public static void main(String args[])
    {
        System.out.print("Enter a number to check it is prime or not:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = 0;
        for(int i=1;i<=num;i++)
        {
            if(num%i == 0)
            {
                x++;
            }  
        }
        if(x<=2 && x!=1)
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number is not Prime");
        }
        sc.close();
    }
}
