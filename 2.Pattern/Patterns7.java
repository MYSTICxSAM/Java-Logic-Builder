package Patterns;
//Inverted and Roteted Half Pyramid
public class Patterns7 
{
    public static void hald_Pyramid(int rows)
    {
        for(int i=1;i<=rows;i++)
        {
            //spaces
            for(int j=1;j<=rows-i;j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        hald_Pyramid(5); 
    }
}
