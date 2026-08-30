class Solution:
    def minimumDeletions(self, nums: List[int]) -> int:
        a = min(nums)
        b = max(nums)
        c = nums.index(a)
        d = nums.index(b)
        n = len(nums)
        if c < d:
            return min(d+1, n - c, (c+1)+ (n - d))
        return min(c+1, n - d, (d+1)+ (n - c))        