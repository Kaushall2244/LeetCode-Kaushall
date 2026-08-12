// Last updated: 8/12/2026, 12:04:50 PM
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        java.util.Map<Integer, Long> minPrefixMap = new java.util.HashMap<>();
        long currentPrefix = 0;
        long maxSum = Long.MIN_VALUE;
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            long prefixBefore = currentPrefix;
            currentPrefix += nums[i];

            int target1 = nums[i] - k;
            int target2 = nums[i] + k;

            if (minPrefixMap.containsKey(target1)) {
                long sum = currentPrefix - minPrefixMap.get(target1);
                if (!found || sum > maxSum) {
                    maxSum = sum;
                    found = true;
                }
            }

            if (minPrefixMap.containsKey(target2)) {
                long sum = currentPrefix - minPrefixMap.get(target2);
                if (!found || sum > maxSum) {
                    maxSum = sum;
                    found = true;
                }
            }

            if (minPrefixMap.containsKey(nums[i])) {
                minPrefixMap.put(nums[i], Math.min(minPrefixMap.get(nums[i]), prefixBefore));
            } else {
                minPrefixMap.put(nums[i], prefixBefore);
            }
        }

        return found ? maxSum : 0;
    }
}