# Last updated: 8/12/2026, 12:19:19 PM
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        return sorted(s.lower()) == sorted(t.lower())