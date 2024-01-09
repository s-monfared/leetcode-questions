class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # counter = 0
        # for num in nums[:]:
        #     if num == 0:
        #         nums.remove(0)
        #         counter += 1
        # l = [0] * counter
        # nums[:] = nums + l
        
        
        k = 0
        for i in range(len(nums)):
            if nums[i] != 0:
                nums[i], nums[k] = nums[k], nums[i]
                k += 1
