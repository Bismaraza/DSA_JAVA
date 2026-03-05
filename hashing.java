import java.util.*;

public class hashing {

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("Pakistan", 150);
        hm.put("US", 7);
        hm.put("VS", 5);
        hm.put("Nepal", 2);
        hm.put("Poland", 10);

        // Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

    }

}
