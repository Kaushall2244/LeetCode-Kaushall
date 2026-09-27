// Last updated: 9/27/2026, 12:41:43 PM
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;

        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }

        int[] ans = new int[size];
        int idx = 0;

        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];

            while (freq-- > 0) {
                ans[idx++] = val;
            }
        }

        return ans;
    }
}