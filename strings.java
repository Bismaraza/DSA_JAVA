import java.util.Scanner;

public class strings {

    public static float getshortestpath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {// O(n)
            char dir = path.charAt(i);
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'W') {
                x--;
            } else {
                x++;
            }

        }
        int X2 = x * x;
        int Y2 = y * y;

        return (float) Math.sqrt(X2 + Y2);
    }

    public static String toUppercase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compress(String str2){
        String newstr = "";

        for(int i= 0; i<str2.length(); i++){
            Integer count = 1;
            while(i<str2.length() -1 && str2.charAt(i) == str2.charAt(i+1)){
                count++;
                i++;

                if(!Character.isLetterOrDigit(l))
            }
            newstr+=str2.charAt(i);
            if(count >1){
                newstr+=count.toString();
            }
        }
        return newstr;
    }
    public static void main(String[] args) {
        // char arr[] = { 'a', 'b' };
        // String str = "abcd";
        // String str2 = new String("xyz");

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);
        // String fullname = "Tony stark";
        // System.out.println(fullname.length());

        // String path = "NS";
        // System.out.println(getshortestpath(path));

        // String fruits[] = {"apple","mango", "banana"};

        // String largest = fruits[0];
        // for(int i= 1; i< fruits.length; i++){ // O(n)
        //     if(largest.compareTo(fruits[i]) > 0){
        //      largest = fruits[i];
        //     }
        // }
        // System.out.println(largest);

        String str = "hi, i am bisma";
        System.out.println(toUppercase(str));

        String str2 = "aaabbcccdd";
        System.err.println(compress(str2));

    }
}
