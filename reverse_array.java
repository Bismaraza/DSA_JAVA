// import java.util.*;
// import java.util.Vector;

// public class reverse_array {
//     // two Pointer Approach
//     public static void reverse(int arr[]) {
//         int start = 0;
//         int end = arr.length - 1;
//         while (start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;

//             start++;
//             end--;
//         }
//     }

//     public static void print(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4};
//         // for each loop
//         Vector<Character> list = new Vector<>();
//         list.add('a');
//         list.add('b');
//         list.add('c');
//         list.add('d');

//         for(Character val: list){
//             System.out.println(val);
//         }
//         reverse(arr);
//         print(arr);
    
//      }
// }

import java.util.*;
import java.util.Vector;

public class reverse_array {
    // two Pointer Approach
    public static void reverse_string(char s[]) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }

    public static void print(char s[]) {
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    public static void main(String[] args) {
        char s[] = {'H', 'e','l','l','o'};
        reverse_string(s);
        print(s);
        
    
     }
}

