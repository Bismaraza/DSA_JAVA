import java.util.*;

public class pair_sum {
    // // Brute force Approach
    // public static int Pairsum(int[] arr, int target) {
    //     int n = arr.length;
    //     int ans = 0;
    //     for (int i = 0; i < n; i++) {
    //         for (int j = i + 1; j < n; j++) {
    //             if (arr[i] + arr[j] == target) {
    //                 ans = arr[i] + arr[j];
    //                 return ans;
    //             }
    //         }
    //     }
    //     return -1;
    // }
    // // Optimized Approach O(n)
    // public static int optimized(int arr[], int target) {
    //     int n = arr.length;
    //     int start = 0;
    //     int end = n - 1;
    //     while (start < end) {
    //         int ans = arr[start] + arr[end];
    //         if (ans > target) {
    //             end--;
    //         } else if (ans < target) {
    //             start++;
    //         } else {
    //              System.out.println(arr[start] + " + " + arr[end] + " = " + ans);
    //         return ans;
    //         }
    //     }
    //     return -1;
    // }

    public static int[]  mostOptimized(int arr[], int target){
        HashMap <Integer, Integer> m = new HashMap<>();
       int ans;
       int n = arr.length;       

       for(int i=0; i < n; i++){
        int first = arr[i];
        int second = target - first;

        if(m.containsKey(second)){
            return new int[]{m.get(second), i};
        }
        m.put(first, i);
       }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 26;
        int [] ans = mostOptimized(arr, target);
        System.out.println(ans[0] + " " + ans[1]);


    }
}
