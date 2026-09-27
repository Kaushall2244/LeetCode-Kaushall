# Last updated: 9/27/2026, 12:25:20 PM
class Solution:
    def canReach(self, start: list[int], target: list[int]) -> bool:
        s = (start[0] + start[1]) % 2
        t = (target[0] + target[1]) % 2
        return s == t