//Finding the perfect square root 

//this program can only calculate square root of number which is a perfect integer.
import java.util.*;
public class Square_root 
{
    public static void main(String args[])
    {
        System.out.print("Enter a number whose Square_Root you want: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sqrt = num;
        int count =0;
        for(int i=1 ;sqrt>0;i=i+2)
        {
            sqrt = sqrt -i;
            count++;
        }
        System.out.println("Its Square Root as an integer is: "+count);
    }    
}
