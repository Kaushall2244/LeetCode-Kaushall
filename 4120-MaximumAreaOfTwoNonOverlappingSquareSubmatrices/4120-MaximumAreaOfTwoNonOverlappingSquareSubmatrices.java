// Last updated: 8/12/2026, 12:04:00 PM
class Solution {
    public int maxArea(int[][] mat) {
        if(mat == null || mat.length==0 || mat[0].length==0){
            return 0;
        }

        int m = mat.length;
        int n = mat[0].length;

        int[][] dp = new int[m][n];
        int maxPoss = Math.min(m, n);

        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                if(mat[r][c]==1){
                    if(r==0||c==0){
                        dp[r][c] =1;
                    }else {
                        dp[r][c] = Math.min(dp[r-1][c], Math.min(dp[r][c-1], dp[r-1][c-1])) + 1;
                    }
                }
            }
        }

        for(int k=maxPoss; k >=1;k--) {
            int minR = Integer.MAX_VALUE, maxR=Integer.MIN_VALUE;
            int minC = Integer.MAX_VALUE, maxC=Integer.MIN_VALUE;
            boolean faA = false;

            for(int r = 0; r <= m - k; r++){
                for(int c = 0; c <= n - k; c++){
                    if(dp[r + k - 1][c + k - 1] >= k) {
                        minR = Math.min(minR, r);
                        maxR = Math.max(maxR, r);
                        minC = Math.min(minC, c);
                        maxC = Math.max(maxC, c);
                        faA = true;
                    }
                }
            }

            if(faA) {
                if(maxR - minR >=k || maxC - minC >= k) {
                    return k*k;
                }
            }
        }

        return 0;
    }
}