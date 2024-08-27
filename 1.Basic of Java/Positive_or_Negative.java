import java.util.*;
public class Positive_or_Negative 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number is Positive or Negative");
        System.out.print("Enter a number to ckeck positive or negative:");
        int num = sc.nextInt();
        if(num>=0)
        {
            System.out.println( num +" is Positive");
        }
        else
        {
            System.out.println("Number is Negative");
        }
    }
}
