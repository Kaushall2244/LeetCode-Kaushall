// Last updated: 8/12/2026, 12:05:14 PM
class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        int n = nums1.length;
        java.util.Set<Integer> set1 = new java.util.HashSet<>();
        java.util.Set<Integer> set2 = new java.util.HashSet<>();
        for (int x : nums1) set1.add(x);
        for (int x : nums2) set2.add(x);

        int c = 0;
        for (int x : set1) {
            if (set2.contains(x)) {
                c++;
            }
        }

        int a = set1.size() - c;
        int b = set2.size() - c;

        int half = n / 2;
        int a1 = Math.min(a, half);
        int r1 = half - a1;

        int b2 = Math.min(b, half);
        int r2 = half - b2;

        return a1 + b2 + Math.min(c, r1 + r2);
    }
}