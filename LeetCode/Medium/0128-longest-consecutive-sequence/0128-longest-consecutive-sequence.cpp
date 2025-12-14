class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int> seq(nums.begin(), nums.end());
        int maxlen = 0;
        for(int i: seq){
            if(seq.find(i-1) == seq.end()){
                int currint = i, curlen = 1;
                while(seq.find(currint+1)!= seq.end()){
                    currint++;
                    curlen++;
                }
                maxlen = max(maxlen, curlen);
            }
        }
        return maxlen;
    }
};