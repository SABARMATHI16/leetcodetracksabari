// Last updated: 2/2/2026, 2:28:58 PM
class Solution {
    public int pivotIndex(int[] nums) {
              int sum = 0;
        for(int i : nums){
            sum += i;
        }
        int xx =0, val =0;
        for(int i = 0;i<nums.length; i++){
            if (i == 0){
                xx = 0;
            }
            else{
                xx += nums[i-1];
            }
            val = sum - nums[i] - xx;
            if(xx == val){
                return i;
            }
        }
        return -1; 
    }
}