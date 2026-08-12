// Last updated: 8/12/2026, 12:05:04 PM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int mf = 0;
        for(int n : nums){
            int f = map.getOrDefault(n, 0) + 1;
            map.put(n, f);
            mf = Math.max(mf, f);
        }
        int a = 0;
        for(int f : map.values()){
            if(f == mf) {
                a += f;
            }
        }
        return a;
    }
}