import java.util.*;

public class Subarray {
    public static void printSubArray(int number[]) {
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(number[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String args[]) {
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        printSubArray(numbers);
    }
}
