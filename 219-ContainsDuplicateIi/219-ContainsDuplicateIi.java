// Last updated: 9/27/2026, 4:28:28 PM
import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i]))
                return true;

            if (set.size() > k)
                set.remove(nums[i - k]);
        }

        return false;
    }
}