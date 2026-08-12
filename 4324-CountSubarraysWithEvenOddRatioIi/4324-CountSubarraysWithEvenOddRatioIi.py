# Last updated: 8/12/2026, 12:03:38 PM
class FenwickTree:
    def __init__(self, size: int):
        self.tree = [0] * (size + 1)

    def add(self, idx: int, val: int):
        while idx < len(self.tree):
            self.tree[idx] += val
            idx += idx & (-idx)

    def query(self, idx: int) -> int:
        s = 0
        while idx > 0:
            s += self.tree[idx]
            idx -= idx & (-idx)
        return s

class Solution:
    def countRatioSubarrays(self, nums: list[int], a: int, b: int) -> int:
        n = len(nums)

        P = [0] * (n + 1)
        O = [0] * (n + 1)

        ec = 0
        oc = 0

        P[0] = 0
        O[0] = 0

        for i in range(n):
            if nums[i] % 2 == 0:
                ec += 1
            else:
                oc += 1

            P[i + 1] = b * ec - a * oc
            O[i + 1] = oc

        sup = sorted(list(set(P)))
        rank = {val: idx + 1 for idx, val in enumerate(sup)}
        m = len(sup)

        bit = FenwickTree(m)

        tv = 0
        iu = 0

        for r in range(1, n + 1):
            while iu < r and O[iu] < O[r]:
                r_val = rank[P[iu]]
                bit.add(r_val, 1)
                iu += 1

            r_curr = rank[P[r]]
            count = bit.query(m) - bit.query(r_curr -1)
            tv += count

        return tv