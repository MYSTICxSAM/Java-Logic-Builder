// In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.

import java.util.*;
class Fibonacci_series
{
    public static void main(String args[])
    {
        System.out.print("Enter a count for Fibonacci Series:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = 0;
        int y = 1;
        System.out.print("Fibonacci: 0 " );
        for(int i = 0 ; i<num ; i++)
        {
            int fibb = x+y;
            System.out.print(fibb + " ");
            y = x;
            x = fibb;
        }
        sc.close();
    }
}
