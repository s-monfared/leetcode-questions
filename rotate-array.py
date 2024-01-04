from copy import deepcopy
class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        k %= len(nums)
        nums[:] = nums[-k:] + nums[:-k]        
    
        # k = k % len(nums)
        # copy = deepcopy(nums)
        # for i in range (k, len(nums)):
        #     nums[i] = copy[i - k]
        # for j in range (0, k):
        #     nums[j] = copy[len(nums) - k + j]    
