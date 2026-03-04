import java.util.*;

// class rotatedarray {
//     public int search(int[] nums, int target) {
//         int start = 0;
//         int end = nums.length - 1;

//         while (start <= end) {
//             int mid = start + (end - start) / 2;

//             // Check if mid is the target
//             if (nums[mid] == target) {
//                 return mid;
//             }

//             // Check if left half is sorted
//             if (nums[start] <= nums[mid]) {
//                 // Target lies in the left sorted half
//                 if (nums[start] <= target && target < nums[mid]) {
//                     end = mid - 1;
//                 } else { // Target is in the right half
//                     start = mid + 1;
//                 }
//             } 
//             // Right half is sorted
//             else {
//                 // Target lies in the right sorted half
//                 if (nums[mid] < target && target <= nums[end]) {
//                     start = mid + 1;
//                 } else { // Target is in the left half
//                     end = mid - 1;
//                 }
//             }
//         }

//         // Target not found
//         return -1;
//     }
// }

class rotatedarray {
    // public static void BubbleSort(int arr[]) {
    // int swap = 0;

    // for (int i = 0; i < arr.length - 1; i++) {
    // for (int j = 0; j < arr.length - 1 - i; j++) {
    // if (arr[j] > arr[j + 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // }

    // }
    // swap++;

    // }
    // System.out.println(swap);

    // }

    // // Optimized approach
    // public static void bubbleSortOptimized(int arr[]) {
    // int n = arr.length;
    // boolean swap = false;

    // for (int i = 0; i < n - 1; i++) {

    // for (int j = 0; j < n - 1 - i; j++) {

    // if (arr[j] > arr[j + 1]) {

    // // swap
    // int temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;

    // swap = true; // mark that swap happened
    // }
    // }

    // // If no swaps happened → array already sorted
    // if (!swap) {
    // break;
    // }

    // }
    // System.out.println("Swap is " + swap);

    // }

    // public static void selectionSort(int arr[]) {
    // int n = arr.length;

    // for (int i = 0; i < n - 1; i++) {// Count turns
    // int smallest = i;
    // for (int j = i + 1; j < n; j++) {

    // if (arr[smallest] < arr[j]) {

    // smallest = j;
    // }
    // }

    // // swap
    // int temp = arr[smallest];
    // arr[smallest] = arr[i];
    // arr[i] = temp;

    // }
    // }

    public static void InsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int pre = i - 1;
            while (pre >= 0 && arr[pre] > curr) {
                arr[pre + 1] = arr[pre];
                pre--;
            }
            arr[pre + 1] = curr;
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 4, 6, 5 };
        // InsertionSort(arr);
        Arrays.sort(arr, 2, 5);
        print(arr);

    }
}