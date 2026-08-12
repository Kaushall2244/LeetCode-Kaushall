// Last updated: 8/12/2026, 12:09:44 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        long x = n ^ (n >> 1);
        return (x & (x + 1)) == 0;
    }
}