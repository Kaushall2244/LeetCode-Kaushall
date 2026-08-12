// Last updated: 8/12/2026, 12:06:07 PM
class Solution {
    public boolean halvesAreAlike(String s) {
        int count = 0;

        for (int i = 0; i < s.length() / 2; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        for (int i = s.length() / 2; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                count--;
            }
        }

        return count == 0;
    }

    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' ||
               c == 'o' || c == 'u';
    }
}