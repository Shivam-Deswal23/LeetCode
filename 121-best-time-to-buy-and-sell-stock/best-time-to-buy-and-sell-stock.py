class Solution(object):
    def maxProfit(self, prices):
        profit = 0
        Min = prices[0]

        for i in range(1,len(prices)):
            cost = prices[i] - Min
            profit = max(cost, profit)
            Min = min(Min, prices[i])
        return profit    
        