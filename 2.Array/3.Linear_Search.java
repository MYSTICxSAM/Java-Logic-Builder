package Array;
import java.util.*;
public class Linear_Search 
{
    public static void main(String args[])
    {
        System.out.print("Enter 5 numbers: ");
        Scanner sc =  new Scanner(System.in);
        int num[] = new int[5];
        for(int i= 0;i<num.length;i++)
        {
            num[i] = sc.nextInt();
        }
        System.out.print("Enter a number to be searched: ");
        int search = sc.nextInt();
        for(int i = 0;i<num.length;i++)
        {
            if(search==num[i])
            {
                System.out.print(num[i] + " is on index " + i);
            }
        }
    sc.close();
    }
}
