// Last updated: 2/2/2026, 2:29:03 PM
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0] * nums[1] * nums[nums.length - 1];
        int b = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        if (a > b)
            return a;
        return b;
    }
}