# Last updated: 8/12/2026, 12:02:58 PM
class Solution:
    def canReach(self, start: list[int], target: list[int]) -> bool:
        s = (start[0] + start[1]) % 2
        t = (target[0] + target[1]) % 2
        return s == t