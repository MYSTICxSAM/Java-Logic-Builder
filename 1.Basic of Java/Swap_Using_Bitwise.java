//Bitwise XOR operator is used to swap two numbers. It is represented by the symbol (^). It compares bits of two operands and returns false or 0 if they are equal and returns true or 1 if they are not equal. 
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
        sc.close();
    }
}
