package Array;
import java.util.*;
public class Largest_Array 
{
    public static void main(String args[])
    {
        int arr[] = new int[5];
        System.out.print("Enter 5 Array: ");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        // searching
        System.out.print("Enter the Element to be Searched:");
        int search = sc.nextInt();
        for(int j=0;j<arr.length;j++)
        {
            if(search == arr[j])
            {
                System.out.println("Number is on positin: " + j);
            }
        }
    }    
}
