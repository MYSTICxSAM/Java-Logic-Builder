import java.util.*;
public class Largset_of_3_number 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find Largest of 3 number");
        System.out.print("Enter 1st Number:");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number:");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd Number:");
        int num3 = sc.nextInt();
        if(num1>num2)                                //This is nested if else
        {
            if(num1>num3)
            {
                System.out.println(num1);
            }
            else
            {
                System.out.println(num3);
            }
        }
        else
        {
            if(num2>num3)
            {
                System.out.println(num2);
            }
            else
            {
                System.out.println(num3);
            }
        }
        sc.close();
    }    
}
