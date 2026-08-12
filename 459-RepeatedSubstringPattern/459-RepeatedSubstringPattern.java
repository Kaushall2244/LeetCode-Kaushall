// Last updated: 8/12/2026, 12:17:08 PM
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        return (s+s).substring(1, 2 * s.length() - 1).contains(s);
    }
}