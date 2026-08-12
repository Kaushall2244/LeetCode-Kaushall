# Last updated: 8/12/2026, 12:03:00 PM
class Solution:
    def maxPairStrength(self, nums: list[int]) -> int:
        max_str = 0;
        n = len(nums)

        for i in range(n):
            for j in range(i + 1, n):
                a, b = nums[i], nums[j]
                g = math.gcd(a,b)
                stre = (a * b) // (g * g)
                max_str = max(max_str, stre)

        return max_str