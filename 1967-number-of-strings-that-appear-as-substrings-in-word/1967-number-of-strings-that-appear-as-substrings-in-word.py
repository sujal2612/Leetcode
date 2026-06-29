class Solution(object):
    def numOfStrings(self, patterns, word):
        """
        :type patterns: List[str]
        :type word: str
        :rtype: int
        """
        c=0
        p=len(patterns)
        for i in range(0,p):
            if(patterns[i] in word):
                c=c+1
        return c
        