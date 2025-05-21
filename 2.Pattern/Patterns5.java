package Patterns;
// character pattern
public class Patterns5 {
    public static void main(String args[])
    {
        char ch = 'A';
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}
