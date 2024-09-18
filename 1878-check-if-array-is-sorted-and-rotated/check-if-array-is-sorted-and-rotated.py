class Solution(object):
    def check(self, nums):
        l  = len(nums)
        count = 0
        for i in range(1,l):
            if(nums[i-1] > nums[i]):
                count+=1
        if(count > 1) or (count==1 and nums[0] < nums[l-1]):
            return False
        return True        
    
    
        # count = 0   
        # l = len(nums)

        # for i in range(1,l):
        #     if nums[i-1] > nums[i]:
        #         count += 1
        
        # if count > 1 or (count == 1 and nums[0] < nums[-1]):
        #     return False
        # return True


        