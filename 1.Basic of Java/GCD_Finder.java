import java.util.*;
public class GCD_Finder 
{
    public static void main(String args[])
    {
        System.out.println("Greatest Common Factor");
        System.out.print("Enter 1st number:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number:");
        int num2 = sc.nextInt();
        int GCD=1;
        for(int i=1 ; i<=num1; i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                GCD = i;
            }
        }
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + GCD);
    }
}
