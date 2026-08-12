// Last updated: 8/12/2026, 12:22:35 PM
class Solution {
    public int singleNumber(int[] nums) {
        int r = 0;
        for(int n: nums){
            r ^= n;
        }
        return r;
    }
}