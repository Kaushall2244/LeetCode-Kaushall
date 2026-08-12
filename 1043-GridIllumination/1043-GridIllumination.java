// Last updated: 8/12/2026, 12:08:30 PM
class Solution {
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        Map<Long, Integer> rows = new HashMap<>();
        Map<Long, Integer> cols = new HashMap<>();
        Map<Long, Integer> diag = new HashMap<>();
        Map<Long, Integer> antiDiag = new HashMap<>();

        Set<Long> active = new HashSet<>();

        for (int[] lamp : lamps) {
            long r = lamp[0];
            long c = lamp[1];
            long key = r * 1000000000L + c;

            if (!active.add(key)) continue;

            rows.put(r, rows.getOrDefault(r, 0) + 1);
            cols.put(c, cols.getOrDefault(c, 0) + 1);
            diag.put(r - c, diag.getOrDefault(r - c, 0) + 1);
            antiDiag.put(r + c, antiDiag.getOrDefault(r + c, 0) + 1);
        }

        int[] ans = new int[queries.length];

        int[][] dirs = {
            {0, 0}, {0, 1}, {0, -1},
            {1, 0}, {-1, 0},
            {1, 1}, {1, -1},
            {-1, 1}, {-1, -1}
        };

        for (int i = 0; i < queries.length; i++) {
            long r = queries[i][0];
            long c = queries[i][1];

            if (rows.containsKey(r) ||
                cols.containsKey(c) ||
                diag.containsKey(r - c) ||
                antiDiag.containsKey(r + c)) {
                ans[i] = 1;
            }

            for (int[] d : dirs) {
                long nr = r + d[0];
                long nc = c + d[1];

                if (nr < 0 || nr >= n || nc < 0 || nc >= n) {
                    continue;
                }

                long key = nr * 1000000000L + nc;

                if (!active.remove(key)) continue;

                decrement(rows, nr);
                decrement(cols, nc);
                decrement(diag, nr - nc);
                decrement(antiDiag, nr + nc);
            }
        }

        return ans;
    }

    private void decrement(Map<Long, Integer> map, long key) {
        int count = map.get(key);

        if (count == 1) {
            map.remove(key);
        } else {
            map.put(key, count - 1);
        }
    }
}