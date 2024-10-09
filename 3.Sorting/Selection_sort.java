package Sorting;
import java.util.*;
public class Bubble_sort 
{
    public static void main(String args[])
    {
        int num[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 elements in array");
        for(int i=0 ;i<num.length;i++)
        {
            num[i] = sc.nextInt();
        }
       for(int j=0;j<(num.length-1);j++)
        {
            for(int i=j+1 ;i<num.length;i++)
            {
                if(num[j] > num[i])
                {
                    int swap = num[j];
                    num[j] = num[i];
                    num[i] = swap;
                }
            }
        }
        for(int i=0 ;i<num.length;i++)
        {
            System.out.println(num[i]);
        }  
    }
}
