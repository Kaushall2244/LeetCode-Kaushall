# Last updated: 8/12/2026, 12:02:55 PM
class Solution:
    def minPrice(self, prices: list[int], discounts: list[int]) -> float:
        prices.sort(reverse=True)
        discounts.sort(reverse=True)

        ts = 0.0

        for i in range(len(prices)):
            if i < len(discounts):
                dis_price = prices[i] * (100 - discounts[i]) / 100.0
                ts += dis_price
            else:
                ts += prices[i]
        return ts