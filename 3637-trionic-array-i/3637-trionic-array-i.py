class Solution:
    def isTrionic(self, nums: List[int]) -> bool:
        n = len(nums)
        if n < 4:
            return False 

        if nums[1] <= nums[0]:
            return False

        phase = 0

        for i in range(1, n):
            if nums[i] == nums[i - 1]:
                return False

            if phase == 0:
                if nums[i] < nums[i - 1]:
                    phase = 1
            elif phase == 1:
                if nums[i] > nums[i - 1]:
                    phase = 2
            else:
                if nums[i] < nums[i - 1]:
                    return False

        return phase == 2