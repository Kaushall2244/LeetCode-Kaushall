// Last updated: 9/27/2026, 12:26:24 PM
class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        int i = 1;

        while (i < nums.length && nums[i] == nums[i - 1] + 1) {
            sum += nums[i];
            i++;
        }

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);

        while (set.contains(sum))
            sum++;

        return sum;
    }
}