class Solution(object):
    def maxSubArray(self, nums):
        current_sum = max_sum = nums[0]

        for i in range(1,len(nums)):
            current_sum = max(nums[i], current_sum+nums[i])

            max_sum = max(current_sum, max_sum)

            if (current_sum < 0):
                current_sum = 0

        return max_sum        