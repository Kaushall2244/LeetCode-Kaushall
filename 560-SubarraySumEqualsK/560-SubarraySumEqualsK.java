// Last updated: 8/12/2026, 12:16:40 PM
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int currentSum = 0;
        java.util.Map<Integer, Integer> prefixSums = new java.util.HashMap<>();
        prefixSums.put(0, 1);

        for (int num : nums) {
            currentSum += num;
            if (prefixSums.containsKey(currentSum - k)) {
                count += prefixSums.get(currentSum - k);
            }
            prefixSums.put(currentSum, prefixSums.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
}