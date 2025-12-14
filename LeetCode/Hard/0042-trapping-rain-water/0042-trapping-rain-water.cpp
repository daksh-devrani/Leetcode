class Solution {
public:
    int trap(vector<int>& height) {
        int left = 0, right = height.size() -1;
        int leftmax = 0, maxright = 0;
        int water = 0;
        while(left<right){
            if(height[left] < height[right]){
                if(height[left] >= leftmax){
                    leftmax = height[left];
                }
                else{
                    water += leftmax - height[left];
                }
                left++;
            }
            else{
                if(height[right] >= maxright){
                    maxright = height[right];
                }
                else{
                    water += maxright - height[right];
                }
                right--;
            }
            
        }
        return water;
    }
};