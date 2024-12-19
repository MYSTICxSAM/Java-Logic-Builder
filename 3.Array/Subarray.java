public class Subarray 
{
    public static void main(String args[])
    {
        int arr[] = {2,4,7,1,9};

        for(int i=0; i<arr.length;i++)
        {
            for(int j=i; j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }    
}
