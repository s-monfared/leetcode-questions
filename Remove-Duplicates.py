class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 1
        j = len(nums)
        for k in range(1, j):
            if (nums[i] == nums[i-1]):
                del nums[i]
            else:
                i += 1
        return len(nums)
