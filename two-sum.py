class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
    
        # for i in range(len(nums)):
        #     # if (nums[i] <= target):
        #     for j in range(i + 1, len(nums)):
        #         if (nums[i] + nums[j] == target):
        #             return [i, j]
        
        # numToIndex={}
        # for i, num in enumerate(nums):
        #   if target - num in numToIndex:
        #     return numToIndex[target - num], i
        #   numToIndex[num] = i
        
        
        numDict = {}
        for i in range (len(nums)):
            if target - nums[i] in numDict:
                return numDict[target - nums[i]], i
            numDict[nums[i]] = i
