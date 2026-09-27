// Last updated: 9/27/2026, 4:27:55 PM
class Solution {
    public char findTheDifference(String s, String t) {
        int x = 0;

        for (char c : s.toCharArray())
            x ^= c;

        for (char c : t.toCharArray())
            x ^= c;

        return (char)x;
    }
}