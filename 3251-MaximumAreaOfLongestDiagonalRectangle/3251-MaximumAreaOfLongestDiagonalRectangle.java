// Last updated: 8/12/2026, 12:04:58 PM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea = 0;
        long maxDiagonal = 0;

        for (int[] d : dimensions) {
            int l = d[0];
            int w = d[1];

            long diagonal = 1L * l * l + 1L * w * w;
            int area = l * w;

            if (diagonal > maxDiagonal || (diagonal == maxDiagonal && area > maxArea)) {
                maxDiagonal = diagonal;
                maxArea = area;
            }
        }

        return maxArea;
    }
}