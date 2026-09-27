// Last updated: 9/27/2026, 12:26:03 PM
class Solution {
    public int countKeyChanges(String s) {
        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(i - 1))) {
                count++;
            }
        }

        return count;
    }
}