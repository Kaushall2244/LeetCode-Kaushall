// Last updated: 8/12/2026, 12:09:24 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        for (char stone : stones.toCharArray()) {
            if (jewels.indexOf(stone) != -1) {
                count++;
            }
        }

        return count;
    }
}