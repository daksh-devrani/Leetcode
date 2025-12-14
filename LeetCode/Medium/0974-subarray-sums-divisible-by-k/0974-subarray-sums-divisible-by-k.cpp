class Solution {
public:
    int subarraysDivByK(vector<int>& nums, int k) {
        unordered_map<int, int> freq;
        freq[0] = 1;
        int ps = 0, count =0;
        for(int a: nums){
            ps += a;
            int remainder = ps%k;
            if(remainder<0){
                remainder += k;
            } 
            count += freq[remainder];
            freq[remainder]++;
        }   
        return count;
    }
    
};