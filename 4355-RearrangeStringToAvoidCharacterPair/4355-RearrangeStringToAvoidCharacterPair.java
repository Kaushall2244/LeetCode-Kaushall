// Last updated: 8/12/2026, 12:03:21 PM
class Solution {
    public String rearrangeString(String s, char x, char y) {
        int[] c = new int[26];
            
        for(char ch: s.toCharArray()) {
            c[ch - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        while(c[y - 'a']>0){
            sb.append(y);
            c[y - 'a']--;
        }

        for(int i=0;i<26;i++){
            char ch = (char) ('a' + i);
            if(ch !=x && ch != y){
                while(c[i] > 0){
                    sb.append(ch);
                    c[i]--;
                }
            }
        }

        while(c[x - 'a']>0){
            sb.append(x);
            c[x - 'a']--;
        }

        return sb.toString();
    }
}