class Solution:
    def count_mismatch(self, a, b):
        count = 0
        for i in range(len(a)):
            if a[i] != b[i]:
                count += 1
            if count >2:
                return count
        return count        
                


    def twoEditWords(self, queries: List[str], dictionary: List[str]) -> List[str]:
        a = []
        for i in range(len(queries)):
            for j in dictionary:
                if self.count_mismatch(queries[i],j) <= 2 and [queries[i], i] not in a:
                    a.append([queries[i], i])
        return [i[0] for i in a]            