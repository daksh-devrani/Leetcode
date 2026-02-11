class Solution {
    public int longestBalanced(int[] nums) {
        int max= 0;
        int balance = 0;
        Map<Integer, Integer> first = new HashMap<>();
        Set<Integer> even = new HashSet<>();
        Set<Integer> odd = new HashSet<>();

        first.put(0,-1);
        for(int i = 0; i<nums.length; i++){
            if(nums[i]%2 == 0){even.add(nums[i]);}
            else{odd.add(nums[i]);}

            balance = even.size() - odd.size();
            if(first.containsKey(balance)){
                max = Math.max(max, i-first.get(balance));
            }
            else{first.put(balance, i);}
        }
        return(max);
    }
}