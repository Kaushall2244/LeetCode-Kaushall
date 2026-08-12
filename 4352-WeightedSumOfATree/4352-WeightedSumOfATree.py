# Last updated: 8/12/2026, 12:03:23 PM
class Solution:
    def weightedSum(self, parent: list[int], nums: list[int]) -> int:
        n = len(parent)
        if n == 0:
            return 0

        adj = defaultdict(list)
        for child in range(1, n):
            adj[parent[child]].append(child)

        depths = {}
        mh = 1

        queue = deque([(0, 1)])

        while queue:
            node, depth = queue.popleft()
            depths[node] = depth
            mh = max(mh, depth)

            for nei in adj[node]:
                queue.append((nei, depth + 1))

        tw = 0
        for i in range(n):
            d = depths[i]
            weight = nums[i] * (mh - d + 1)
            tw += weight

        return tw