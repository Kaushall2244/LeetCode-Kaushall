// Last updated: 9/27/2026, 4:25:58 PM
class Solution {
    public int removePalindromeSub(String s) {
        String rev = new StringBuilder(s).reverse().toString();

        if (s.equals(rev))
            return 1;

        return 2;
    }
}