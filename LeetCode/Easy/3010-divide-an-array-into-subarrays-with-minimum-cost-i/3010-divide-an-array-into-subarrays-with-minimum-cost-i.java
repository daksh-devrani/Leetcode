class Solution {
    public int minimumCost(int[] nums) {
        int first = nums[0];
        int i = nums[1];
        int bestpair = Integer.MAX_VALUE;
        for(int j = 2; j<nums.length; j++){
            bestpair = Math.min(bestpair, i + nums[j]);
            i = Math.min(i, nums[j]);
        }
        return(first + bestpair);
    }
}