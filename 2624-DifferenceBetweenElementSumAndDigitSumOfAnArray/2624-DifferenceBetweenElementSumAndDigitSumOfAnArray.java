// Last updated: 2/2/2026, 2:28:19 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
           while(nums[i]!=0) {
                count += nums[i] % 10;
                nums[i]/=10;

            }
        }
        return Math.abs( sum - count);
    }
}
