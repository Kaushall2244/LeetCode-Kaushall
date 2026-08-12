// Last updated: 8/12/2026, 12:19:04 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] c = s.toLowerCase().toCharArray();
        char[] b = t.toLowerCase().toCharArray();

        Arrays.sort(c);
        Arrays.sort(b);
        boolean v = Arrays.equals(c,b);
        return v;
    }    
}