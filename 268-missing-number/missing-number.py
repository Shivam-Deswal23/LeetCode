class Solution(object):
    def missingNumber(self, nums):
        n = len(nums)
        sum = (n*(n+1))/2
        s2 = 0           

        for i in range(n):
            s2 = s2 + nums[i]
            m = sum-s2
        return m    
        