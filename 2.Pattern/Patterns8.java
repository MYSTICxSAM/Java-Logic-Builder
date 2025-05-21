package Patterns;
//Inverted half pyramid with numbers
public class Patterns8 
{
    public static void halfPyramid_Number(int rows)
    {
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<rows-i+1;j++)
            {
                System.out.print(j);
            }
            System.err.println();
        }
    }
    public static void main(String args[])
    {
        halfPyramid_Number(6);
    }    
}
