// Last updated: 8/12/2026, 12:08:58 PM
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxKadane = nums[0];
        int curMax = 0;
        int minKadane = nums[0];
        int curMin = 0;

        for (int x : nums) {
            curMax = Math.max(curMax + x, x);
            maxKadane = Math.max(maxKadane, curMax);

            curMin = Math.min(curMin + x, x);
            minKadane = Math.min(minKadane, curMin);

            totalSum += x;
        }

        if (maxKadane > 0) {
            return Math.max(maxKadane, totalSum - minKadane);
        } else {
            return maxKadane;
        }
    }
}