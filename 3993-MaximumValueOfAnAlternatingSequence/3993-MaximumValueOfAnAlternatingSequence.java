// Last updated: 9/27/2026, 12:25:17 PM
class Solution {
    public long maximumValue(int n, int s, int m) {
        long[] ml = {(long) n, (long) s, (long) m};

        if( n == 1) return s;

        long p = n / 2;
        return (long) s + m + (p - 1) * (long) (m - 1);
    }
}