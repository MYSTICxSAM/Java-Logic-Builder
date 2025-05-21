package Patterns;
//FLOYD's Triangle
public class Patterns9 
{
    public static void floyds(int rows)
    {
        int count=1;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        floyds(6);
    }       
}
