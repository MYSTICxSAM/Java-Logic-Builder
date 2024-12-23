public class MaxSubarray 
{
    public static void main(String args[])
    {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int arr[] = {2,4,7,1,9};

        for(int i=0; i<arr.length;i++)
        {
            for(int j=i; j<arr.length;j++)
            {
                currSum = 0;
                for(int k=i;k<=j;k++)
                {
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum)
                {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sub array is: " + maxSum);
    }    
}
