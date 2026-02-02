// Last updated: 2/2/2026, 2:29:46 PM
class Solution {
    public void sortColors(int[] nums) {
     int zi=0,ti=nums.length-1,i=0
;
while(i<=ti){
    if(nums[i]==0){
        int t=nums[i];
        nums[i++]=nums[zi];
        nums[zi++]=t;}
        else if(nums[i]==1) ++i;
        else{
            int t=nums[i];
            nums[i]=nums[ti];
            nums[ti--]=t;
    }
}    }
}