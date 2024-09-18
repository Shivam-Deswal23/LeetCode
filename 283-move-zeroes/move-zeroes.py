class Solution(object):
    def moveZeroes(self, nums):
        j = -1
        l = len(nums)

        for i in range(l):
            if(nums[i] == 0):
                j = i
                break

        if j == -1:
            return nums                

        for i in range(j+1, l):
            if(nums[i] != 0):
                nums[i],nums[j] = nums[j],nums[i] 
                j+=1
        return nums                