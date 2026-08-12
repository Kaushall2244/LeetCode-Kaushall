// Last updated: 8/12/2026, 12:03:50 PM
class Solution {
    public int getLength(int[] nums) {
        int[] dremovical = nums;

        int n = nums.length;
        int ans = 1;

        for (int l = 0; l < n; l++) {

            HashMap<Integer, Integer> freq = new HashMap<>();
            HashMap<Integer, Integer> cntFreq = new HashMap<>();

            int maxFreq = 0;

            for (int r = l; r < n; r++) {

                int x = nums[r];

                int old = freq.getOrDefault(x, 0);

                if (old > 0) {
                    cntFreq.put(old, cntFreq.get(old) - 1);
                    if (cntFreq.get(old) == 0) {
                        cntFreq.remove(old);
                    }
                }

                int now = old + 1;
                freq.put(x, now);

                cntFreq.put(now, cntFreq.getOrDefault(now, 0) + 1);

                maxFreq = Math.max(maxFreq, now);

                int len = r - l + 1;

                if (freq.size() == 1) {
                    ans = Math.max(ans, len);
                    continue;
                }

                if ((maxFreq & 1) == 1) continue;

                int half = maxFreq / 2;

                int maxCount = cntFreq.getOrDefault(maxFreq, 0);
                int halfCount = cntFreq.getOrDefault(half, 0);

                if (maxCount > 0
                        && halfCount > 0
                        && maxCount + halfCount == freq.size()) {

                    ans = Math.max(ans, len);
                }
            }
        }

        return ans;
    }
}