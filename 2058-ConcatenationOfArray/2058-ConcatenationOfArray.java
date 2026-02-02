// Last updated: 2/2/2026, 2:28:35 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr=new int[2*nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
            arr[i+nums.length]=nums[i];
            
        }
        return arr;
    }
}