// Last updated: 2/2/2026, 2:29:51 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int ms = nums[0];
        int cs = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            cs += nums[i];
            if (cs > ms)
                ms = cs;
            if (cs < 0)
                cs = 0;
        }
        return ms;
    }
}