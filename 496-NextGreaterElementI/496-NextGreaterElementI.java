// Last updated: 9/27/2026, 4:27:42 PM
import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for (int x : nums2) {
            while (!st.empty() && st.peek() < x)
                map.put(st.pop(), x);

            st.push(x);
        }

        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++)
            ans[i] = map.getOrDefault(nums1[i], -1);

        return ans;
    }
}