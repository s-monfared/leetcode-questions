class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        # nums3 = []
        # for num in nums1[:]:
        #     if num in nums2:
        #         nums3.append(num)
        #         nums2.remove(num)
        #     nums1.remove(num)    
        # return nums3
        
        # for num in nums1[:]:
        #     if num in nums2:
        #         nums2.remove(num)
        #     else:
        #         nums1.remove(num)
        # return nums1
        
        d = {}
        res = []
        for num in nums1:
            if num not in d:
                d[num] = 0
            d[num] += 1
        for num in nums2:
            if num in d and d[num] > 0:
                res.append(num)
                d[num] -= 1
        return res        
