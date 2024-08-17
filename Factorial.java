//Factorial of n is the product of all positive descending integers.
import java.util.*;
public class Factorial 
{
    public static void main(String args[])
    {
        System.out.print("Enter a number of which u want Factorial:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial=1;
        for(int i = num;i>0;i--) //Multiplying the Factorial 
        {
            factorial = factorial*i;
        }
        System.out.println("Factorial: " + factorial);
    }
}
