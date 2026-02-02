// Last updated: 2/2/2026, 2:28:59 PM
class Solution {
    public int findShortestSubArray(int[] nums) {
        int maxVal = 50000;
        int[] count = new int[maxVal];
        int[] first = new int[maxVal];
        int[] last = new int[maxVal];
        for (int i = 0; i < maxVal; i++) {
            first[i] = -1;
        }
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (first[num] == -1) {
                first[num] = i;
            }
            count[num]++;
            last[num] = i;
        }
        int degree = 0;
        for (int i = 0; i < maxVal; i++) {
            degree = Math.max(degree, count[i]);
        }
        int minLength = nums.length;
        for (int i = 0; i < maxVal; i++) {
            if (count[i] == degree) {
                minLength = Math.min(minLength, last[i] - first[i] + 1);
            }
        }
        return minLength;
    }
}
