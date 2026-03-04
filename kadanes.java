import java.util.*;

public class kadanes {

    // Kadanes Algorithm
  
    public static void kadaness(int numbers[]) {
        int currentSum = 0;
        int MaximumSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            currentSum = currentSum + numbers[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            MaximumSum = Math.max(currentSum, MaximumSum);
        }
        System.out.println(MaximumSum);
    }

    
    // Brute force

    public static void Subarray(int numbers[]) {
        int maxSum = Integer.MIN_VALUE; // track maximum sum

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int sum = 0; // sum  of current subarray
                for (int k = i; k <= j; k++) {
                    // System.out.print(numbers[k] + " "); // print subarray
                    sum = sum + numbers[k];
                }
                System.out.println(" | Sum = " + sum); // print sum of this subarray
                if (sum > maxSum) {
                    maxSum = sum; // update max sum
                }
            }
            System.out.println(); // space between groups
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // Subarray(numbers);
        kadaness(numbers);
    }
}