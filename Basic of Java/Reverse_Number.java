import java.util.Scanner;
class Reverse_Number
{
    public static void main(String args[])
    {
        System.out.print("Enter a number whose reverse you want: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = 0;
        int y = 0;
        for(int i = num;i>0;i = i/10)
        {
            x = i%10;
            y = (y*10) + x;
        }
        System.out.println("Reverse of the number is: " + y);
    }
}