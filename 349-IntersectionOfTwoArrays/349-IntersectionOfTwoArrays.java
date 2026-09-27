// Last updated: 9/27/2026, 4:28:01 PM
import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for (int x : nums1)
            set.add(x);

        HashSet<Integer> ans = new HashSet<>();

        for (int x : nums2) {
            if (set.contains(x))
                ans.add(x);
        }

        int[] res = new int[ans.size()];
        int i = 0;

        for (int x : ans)
            res[i++] = x;

        return res;
    }
}