// Last updated: 9/27/2026, 12:26:30 PM
import java.util.*;

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int count = 0;

        for (String word : words) {
            String rev = new StringBuilder(word).reverse().toString();

            if (set.contains(rev)) {
                count++;
            } else {
                set.add(word);
            }
        }

        return count;
    }
}