// Last updated: 8/12/2026, 12:16:43 PM
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (String word : words) {
            ans.append(new StringBuilder(word).reverse()).append(" ");
        }

        return ans.toString().trim();
    }
}