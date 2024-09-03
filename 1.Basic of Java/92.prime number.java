/*
Read an integer (n) from the user.
In the while loop, execute the condition (c!=n). Initially, the variable c is 0 and counts the discovered prime numbers.
Increment the variable i (initially 1) by 1 for the next number check.
Check if the variable i is prime or not.
If yes, increment the variable c by 1.
*/

import java.util.*;
public class nth_prime
{
    public static void main(String args[])
    {
        System.out.print("Enter a number to get nth prime number:");
        Scanner sc = new Scanner(System.in);
        int nth = sc.nextInt();
        int count =0;
        int num =1,i;
        while(count<nth) // to increment
        {
            num++;
            for(i = 2;i<=num;i++)  //logic for prime number
            {
                if(num%i==0)
                {
                    break;
                }
            }  
            if(i==num)
            {
                count++;
            }   
        }
        System.out.print("The" + nth +"Prime Number is" + num);
    }    
}
