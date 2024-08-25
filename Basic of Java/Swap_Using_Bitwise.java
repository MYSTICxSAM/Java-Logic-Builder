import java.util.*;
public class Swap_Using_Bitwise 
{
    public static void main(String args[])
    {
        System.out.print("Which number do you want to swap? \nEnter 1st number:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number:");
        int num2 = sc.nextInt();
        System.out.println("After Swapping");
        num1 = num1 ^ num2;  //These operations are to swap 
        num2 = num1 ^ num2;  // XOR operation
        num1 = num1 ^ num2;
        System.out.println("1st number is " + num1);
        System.out.println("2nd number is " + num2);
    }
}
