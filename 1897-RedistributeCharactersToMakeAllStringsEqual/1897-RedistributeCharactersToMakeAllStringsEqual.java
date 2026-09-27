// Last updated: 9/27/2026, 12:26:39 PM
class Solution {
    public boolean makeEqual(String[] words) {
        int[] freq = new int[26];

        for (String word : words) {
            for (char c : word.toCharArray()) {
                freq[c - 'a']++;
            }
        }

        for (int f : freq) {
            if (f % words.length != 0) {
                return false;
            }
        }

        return true;
    }
}