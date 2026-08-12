// Last updated: 8/12/2026, 12:03:28 PM
class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum = 0;
        int squareSum = 0;

        while (n > 0) {
            int digit = n % 10;
            digitSum += digit;
            squareSum += digit * digit;
            n /= 10;
        }

        return (squareSum - digitSum) >= 50;
    }
}