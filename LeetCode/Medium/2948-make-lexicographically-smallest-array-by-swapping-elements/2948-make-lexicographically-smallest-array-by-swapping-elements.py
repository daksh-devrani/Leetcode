class Solution:
    def lexicographicallySmallestArray(self, nums: List[int], limit: int) -> List[int]:
        a = nums.copy()
        pairs = [(nums[i], i) for i in range(len(nums))]
        pairs.sort()
        groups = []
        group = []
        for i in range(len(pairs)):
            if group == []:
                group.append(pairs[i])
            elif (pairs[i][0] - group[-1][0]) <= limit:
                group.append(pairs[i])
            else:
                groups.append(group)
                group = []
                group.append(pairs[i])  
        groups.append(group)          
        for group in groups:
            value = []
            index = []
            for i, j in group:
                value.append(i)
                index.append(j)
            index.sort()
            for i in range(len(value)):
                a[index[i]] = value[i]

        return a                    

