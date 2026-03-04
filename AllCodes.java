import java.util.*;

// ===============================
// Main Public Class (File Name: AllCodes.java)
// ===============================
public class AllCodes {
    public static void main(String[] args) {
        System.out.println("Run any class by changing main method inside that class.");
    }
}

// ===============================
// 1️⃣ Binary Search
// ===============================
class arrays {
    public static int BinarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 25;
        System.out.println("Index is :" + BinarySearch(numbers, key));
    }
}

// ===============================
// 2️⃣ Subarrays, Pairs, Reverse
// ===============================
class arr {

    public static void SubArray(int numbers[]) {
        int Currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                System.out.println(Currsum);

                if (maxSum < Currsum) {
                    maxSum = Currsum;
                }
            }
        }
        System.out.println("MaxSum = " + maxSum);
    }

    public static void Pairs(int numbers[]) {
        int tp = 0;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.println("(" + numbers[i] + " " + numbers[j] + ")");
                sum = numbers[i] + numbers[j];
                System.out.println(" Sum of every pair is " + sum);
            }
            tp++;
        }
        System.out.println();
        System.out.println("Total Pairs: " + tp);
    }

    public static void reverse(int numbers[]) {
        int first = 0;
        int last = numbers.length - 1;

        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        SubArray(numbers);
    }
}

// ===============================
// 3️⃣ Reverse Array
// ===============================
class array {

    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        reverse(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

// ===============================
// 4️⃣ Java Course Methods
// ===============================
class Javacourse {

    public static void BtoD(int n) {
        int power = 0;
        int decnum = 0;

        while (n > 0) {
            int lastdigit = n % 10;
            decnum = decnum + (lastdigit * (int) Math.pow(2, power));
            power++;
            n = n / 10;
        }

        System.out.println("Binary to Decimal: " + decnum);
    }

    public static float averageNumber(int a, int b, int c) {
        return (a + b + c) / 3.0f;
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static void binary(int n) {
        int power = 0;
        int binNum = 0;

        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, power));
            power++;
            n = n / 2;
        }

        System.out.println("Binary Form: " + binNum);
    }

    public static void palindrome(int n) {
        int original = n;
        int rev = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }

        if (rev == original) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    public static void main(String[] args) {
        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}

// ===============================
// 5️⃣ Prime
// ===============================
class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num == 2) {
            System.out.print(" Number is prime");
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime == true) {
                System.out.print(" Number is prime");
            } else {
                System.out.print(" Number is not prime");
            }
        }
    }
}

// ===============================
// 6️⃣ Solution
// ===============================
class Solution {

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int bincoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int bincoeff = fact_n / (fact_r * fact_nmr);
        return bincoeff;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b, float c) {
        return a + b + c;
    }

    public static boolean isPrime(int n) {
        if (n == 2) return true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primeInRange(100);
    }
}