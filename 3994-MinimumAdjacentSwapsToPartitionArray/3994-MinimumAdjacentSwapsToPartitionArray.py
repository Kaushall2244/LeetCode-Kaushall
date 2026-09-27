# Last updated: 9/27/2026, 12:25:31 PM
class Solution:
    def minAdjacentSwaps(self, nums: list[int], a: int, b: int) -> int:
        mod = 10**9+7

        c1 =0
        c2=0
        s=0

        for x in nums:
            if x <a:
                s += c1 + c2
            elif x<=b:
                s += c2
                c1 += 1
            else:
                c2 += 1

        return s % mod