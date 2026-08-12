// Last updated: 8/12/2026, 12:18:53 PM
class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
        return 1 + (num - 1) % 9;
    }
}