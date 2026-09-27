// Last updated: 9/27/2026, 12:43:24 PM
class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}