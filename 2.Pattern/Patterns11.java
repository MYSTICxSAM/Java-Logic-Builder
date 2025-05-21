package Patterns;
//Butterfly pattern
public class Patterns11 
{
    public static void butterfly(int rows)
    {
        //first half                                                 
        for(int i=1;i<=rows;i++)
        {
            // stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            // spaces 2*(rows-1)
            for(int j=1;j<=2*(rows-i);j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=rows;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(rows-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        butterfly(4);
    }
}
