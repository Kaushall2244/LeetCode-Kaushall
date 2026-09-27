// Last updated: 9/27/2026, 4:29:28 PM
class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ')
            i--;

        int count = 0;

        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }
}