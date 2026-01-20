class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        val = 0
        for i in range(len(nums)):
            val = val^nums[i]

        return val
        