package Array;
import java.util.*;
public class Reverse_array 
{
    public static void main(String args[])
    {
        System.out.print("Enter the elements of array: ");
        int n[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<n.length;i++)
        {
            n[i] = sc.nextInt();
        }
        System.out.print("Reverse of the array is: ");
        int n1[] = new int[5];
        for(int i = 0;i<n.length;i++)
        {
            n1[i] = n[n.length-i - 1];
        }
        for(int i = 0;i<n.length;i++)
        {
            System.out.print(n1[i] + " ");
        }
        sc.close();
    }
}
