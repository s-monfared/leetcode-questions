class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        # nums2 = []
        # for num in nums[:]:
        #     if num in nums2:
        #         nums.remove(num)
        #         nums2.remove(num)  
        #     else:
        #         nums2.append(num)
        #         nums.remove(num)
        # return nums2[0]
        
        uniq = 0
        for num in nums:
            uniq ^= num
        return uniq
