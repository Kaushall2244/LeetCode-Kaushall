# Last updated: 8/12/2026, 12:03:48 PM
class Solution:
    def countRatioSubarrays(self, nums: list[int], a: int, b: int) -> int:
        ans = 0
        n = len(nums)

        for start in range(n):
            x = 0
            y = 0

            for end in range(start, n):
                if nums[end] % 2 == 0:
                    x += 1
                else:
                    y += 1

                if y > 0 and (x*b <= y*a):
                    ans += 1

        return ans