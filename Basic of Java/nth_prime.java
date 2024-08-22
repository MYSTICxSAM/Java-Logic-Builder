import java.util.*;
public class nth_prime
{
    public static void main(String args[])
    {
        System.out.print("Enter a number to get nth prie number:");
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
