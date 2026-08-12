# Last updated: 8/12/2026, 12:18:05 PM
class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        if num == 1:
            return True

        left = 1
        right = num  # The square root of num cannot be greater than num itself.

        while left <= right:
            mid = left + (right - left) // 2
            
            # In Python, integers handle arbitrary precision, so mid * mid will not overflow.
            # In languages like C++ or Java, one would need to be careful with potential overflow
            # if mid is large, possibly using a 64-bit integer type for 'square' or checking
            # 'if mid > num / mid' to avoid explicit multiplication.
            square = mid * mid

            if square == num:
                return True
            elif square < num:
                left = mid + 1
            else: # square > num
                right = mid - 1
        
        return False