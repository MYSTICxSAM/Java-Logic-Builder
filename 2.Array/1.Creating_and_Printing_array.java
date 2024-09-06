package Array;
import java.util.*;
public class Creating_and_Printing
{
    public static void main(String[] args) 
    {
        int[] numbers = new int[10]; //array of integers with a size of 10
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 Elements:");
        for (int i = 0; i < numbers.length; i++) 
        {
            numbers[i] =  sc.nextInt();//Fill the array with numbers from 1 to 10
        }
        System.out.print("Array elements are:");
        for (int number : numbers)// Print the array elements 
        {
            System.out.print(number + " ");
        }
        sc.close();
    }
}
