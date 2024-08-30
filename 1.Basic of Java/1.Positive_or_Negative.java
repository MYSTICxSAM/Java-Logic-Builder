import java.util.*;
public class Positive_or_Negative 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number is Positive or Negative");
        System.out.print("Enter a number to ckeck positive or negative:");
        int num = sc.nextInt();
        if(num>=0)//if number is greater than zero or equal to
        {
            System.out.println( num +" is Positive Number");
        }
        else
        {
            System.out.println(num +" is Negative Number");
        }
        sc.close();
    }
}
