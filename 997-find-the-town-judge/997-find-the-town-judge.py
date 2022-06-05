class Solution:
    def findJudge(self, n: int, trust: List[List[int]]) -> int:
        inDeg = list()
        
        for i in range(n):
            inDeg.append(0)
            
        for i in range(len(trust)):
            inDeg[trust[i][1] - 1]+=1
            inDeg[trust[i][0] - 1]-=1
        
        for i in range(len(inDeg)):
            if inDeg[i] == n-1:
                return i+1
        
        return -1
        