// Last updated: 2/2/2026, 2:28:00 PM
class Solution {
    public long maximumScore(int[] nums) {
        int n = nums.length;
        int[] sm = new int[n];
        sm[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < sm[i + 1])
                sm[i] = nums[i];
            else
                sm[i] = sm[i + 1];
        }
        long ps = nums[0];
        long s = ps - sm[1];
        for (int i = 1; i < n - 1; i++) {
            ps += nums[i];
            long score = ps - sm[i + 1];
            if (score > s)
                s = score;
        }
        return s;
    }
}