// Last updated: 8/12/2026, 12:07:03 PM
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] losses = new int[100001];
        java.util.Arrays.fill(losses, -1);

        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];

            if (losses[winner] == -1) {
                losses[winner] = 0;
            }

            if (losses[loser] == -1) {
                losses[loser] = 1;
            } else {
                losses[loser]++;
            }
        }

        List<Integer> zeroLosses = new java.util.ArrayList<>();
        List<Integer> oneLoss = new java.util.ArrayList<>();

        for (int i = 1; i <= 100000; i++) {
            if (losses[i] == 0) {
                zeroLosses.add(i);
            } else if (losses[i] == 1) {
                oneLoss.add(i);
            }
        }

        List<List<Integer>> answer = new java.util.ArrayList<>();
        answer.add(zeroLosses);
        answer.add(oneLoss);
        return answer;
    }
}