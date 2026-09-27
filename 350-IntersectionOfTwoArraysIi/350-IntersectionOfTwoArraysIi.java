// Last updated: 9/27/2026, 4:27:59 PM
import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : nums1)
            map.put(x, map.getOrDefault(x, 0) + 1);

        ArrayList<Integer> list = new ArrayList<>();

        for (int x : nums2) {
            if (map.getOrDefault(x, 0) > 0) {
                list.add(x);
                map.put(x, map.get(x) - 1);
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++)
            ans[i] = list.get(i);

        return ans;
    }
}