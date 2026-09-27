// Last updated: 9/27/2026, 12:42:39 PM
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