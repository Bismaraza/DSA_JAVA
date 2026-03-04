import java.util.*;

public class ar {

    // public static int buyandSell(int prices[]) {
    // int maximun_profit = 0;
    // int BuyPrice = Integer.MAX_VALUE;

    // for (int i = 0; i < prices.length; i++) {
    // if (BuyPrice < prices[i]) {
    // int profit = prices[i] - BuyPrice; // Todays Profit
    // maximun_profit = Math.max(maximun_profit, profit); // Global Profit
    // } else {
    // BuyPrice = prices[i];
    // }
    // }
    // return maximun_profit;
    // }

    public static int array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int result=0;

            result = result ^ arr[i];
            return result;

        }
    }

    public static void main(String[] args) {
        // int prices[] = { 7, 1, 5, 3, 6, 4 };
        // System.out.println(buyandSell(prices));
        int arr[] = { 1, 2, 3, 1 };
        System.out.println(arr);
    }
}
