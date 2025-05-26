public class MaxSubarray 
{
    public static void main(String args[])
    {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int arr[] = {1,-2,6,-1,3};
        int prefix[] = new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0; i<arr.length;i++)
        {
            for(int j=i; j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    currSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
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

