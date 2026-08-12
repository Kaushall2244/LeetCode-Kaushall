// Last updated: 8/12/2026, 12:17:18 PM
class Solution {
    public int countSegments(String s) {
        s = s.trim();

        if (s.length() == 0) {
            return 0;
        }

        return s.split("\\s+").length;
    }
}