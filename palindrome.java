public class palindrome {
    public static void main(String[] args) {
        int x = 1211;
        int original = x;
        int rev = 0;
        while (x>0) {
            int lastdigit = x % 10;
            rev = (rev * 10) + lastdigit;
            x = x / 10;
        }
        if (rev == original) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println(" Not Palindrome");
        }
    }
}
