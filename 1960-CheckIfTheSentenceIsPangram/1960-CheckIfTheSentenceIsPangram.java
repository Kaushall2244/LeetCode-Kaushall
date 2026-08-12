// Last updated: 8/12/2026, 12:05:55 PM
class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];

        for (char c : sentence.toCharArray()) {
            seen[c - 'a'] = true;
        }

        for (boolean b : seen) {
            if (!b) {
                return false;
            }
        }

        return true;
    }
}