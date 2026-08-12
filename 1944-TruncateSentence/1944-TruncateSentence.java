// Last updated: 8/12/2026, 12:06:01 PM
class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < k; i++) {
            if (i > 0) {
                ans.append(" ");
            }
            ans.append(words[i]);
        }

        return ans.toString();
    }
}