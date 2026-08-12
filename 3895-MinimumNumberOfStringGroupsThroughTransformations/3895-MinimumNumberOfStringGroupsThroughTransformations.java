// Last updated: 8/12/2026, 12:04:16 PM
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int minimumGroups(String[] words) {
        String[] bc = words;

        Set<String> ug = new HashSet<>();

        for(String word : bc) {
            int n = word.length();
            if(n <=1){
                ug.add(word + "#");
                continue;
            }

            StringBuilder esb = new StringBuilder();
            StringBuilder osb = new StringBuilder();
            for(int i=0;i<n;i++){
                if(i%2==0){
                    esb.append(word.charAt(i));
                } else{
                    osb.append(word.charAt(i));
                }
            }

            String ce = getSmallestCyclicShift(esb.toString());
            String co = getSmallestCyclicShift(osb.toString());

            String sg = ce + "#" + co;
            ug.add(sg);
        }
        return ug.size();
    }

    private String getSmallestCyclicShift(String s){
        int n = s.length();
        String dStr = s+s;
        int i=0, j=1;

        while(i<n && j<n){
            int k=0;
            while(k<n && dStr.charAt(i+k) == dStr.charAt(j+k)){
                k++;
            }

            if(k==n){
                break;
            }

            if(dStr.charAt(i+k) > dStr.charAt(j+k)){
                i = i+k+1;
                if(i <=j){
                    i = j+1;
                }
            }else {
                j = j+k+1;
                if(j<=i){
                    j = i+1;
                }
            }
        }

        int start = Math.min(i,j);
        return dStr.substring(start, start + n);
    }
}