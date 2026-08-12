// Last updated: 8/12/2026, 12:24:39 PM
class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double ans = 1;
        while (N > 0) {
            if ((N & 1) == 1)
                ans *= x;
            x *= x;
            N >>= 1;
        }
        return ans;
    }
}