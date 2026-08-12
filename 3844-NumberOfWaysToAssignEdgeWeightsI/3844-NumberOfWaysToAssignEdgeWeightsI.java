// Last updated: 8/12/2026, 12:04:22 PM
import java.util.*;

class Solution {

    static final int MOD = 1000000007;

    public int assignEdgeWeights(int[][] edges) {

        int n = edges.length + 1;

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];
        int[] depth = new int[n + 1];

        q.offer(1);
        visited[1] = true;

        int maxDepth = 0;

        while (!q.isEmpty()) {

            int node = q.poll();

            maxDepth = Math.max(maxDepth, depth[node]);

            for (int next : graph.get(node)) {

                if (!visited[next]) {
                    visited[next] = true;
                    depth[next] = depth[node] + 1;
                    q.offer(next);
                }
            }
        }

        return power(2, maxDepth - 1);
    }

    private int power(long base, int exp) {

        if (exp < 0) return 0;

        long ans = 1;

        while (exp > 0) {

            if ((exp & 1) == 1) {
                ans = (ans * base) % MOD;
            }

            base = (base * base) % MOD;
            exp >>= 1;
        }

        return (int) ans;
    }
}