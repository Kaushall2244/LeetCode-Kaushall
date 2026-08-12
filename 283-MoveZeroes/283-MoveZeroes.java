// Last updated: 8/12/2026, 12:18:41 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int idx = 0;

        for (int num : nums)
            if (num != 0)
                nums[idx++] = num;

        while (idx < nums.length)
            nums[idx++] = 0;
    }
}